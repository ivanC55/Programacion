/**
 * @Author: Iván Cerros Brioso
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOImpMariaDB implements DAO<Alumno> {
    private Connection connection;

    /**
     * Constructor de la clase que establece la conexión con la base de datos.
     *
     * @throws SQLException si ocurre algún error al establecer la conexión.
     */
    public DAOImpMariaDB() throws SQLException {
        connection = DriverManager.getConnection(Conn.getUri());
    }

    /**
     * Obtiene el elemento indicado por su id
     *
     * @param id de tipo long
     * @return Objeto de la clase Alumno
     */
    @Override
    public Alumno getById(long id) throws SQLException {
        String sql = "SELECT * FROM alumnos WHERE id = ?";
        PreparedStatement stat = connection.prepareStatement(sql);
        stat.setLong(1, id);
        ResultSet resultSet = stat.executeQuery();
        if (resultSet.next()) {
            return new Alumno(
                    resultSet.getString("nombre"),
                    resultSet.getString("dni"),
                    resultSet.getString("email"),
                    resultSet.getString("fechaNacimiento"));
        } else {
            return null;
        }
    }

    /**
     * Obtiene una lista con TODOS elementos de Alumno
     *
     * @return List<Alumno>
     */
    @Override
    public List<Alumno> getAll() throws SQLException {
        String sql = "SELECT nombre, email FROM alumnos";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Alumno> alumnos = new ArrayList<>();
        while (resultSet.next()) {
            alumnos.add(new Alumno(
                    resultSet.getString("nombre"),
                    resultSet.getString("email")
            ));
        }
        return alumnos;
    }

    /**
     * Inserta un nuevo elemento Alumno
     *
     * @param alumno de tipo Alumno
     * @return (tipo long) id del elemento insertado o -1 si se produjo algún error.
     */
    public long add(Alumno alumno) throws SQLException {
        String sql = "INSERT INTO alumnos (nombre, email, dni, fechaNacimiento) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, alumno.getNombre());
        statement.setString(2, alumno.getEmail());
        statement.setString(3, alumno.getDni());
        statement.setString(4, alumno.getFechaNacimiento());
        int filasAfectadas = statement.executeUpdate();

        if (filasAfectadas == 0) {
            throw new SQLException("No rows affected. Failed to insert student: " + alumno);
        }

        // obtengo un array de ID nuevos
        ResultSet rs = statement.getGeneratedKeys();
        if (rs.next()) {
            return rs.getLong(1);
        } else {
            throw new SQLException("Error obtaining the id of the inserted student.");
        }
    }


    /**
     * Inserta una coleción completa de tipo Alumno
     *
     * @param list (List<Alumno>)
     * @return List<long> con una lista de todos los id's o -1 si se produjo error al insertar elementos. Si no hubo
     * error, pero no se insertó ninguno se devuelve una List de tamaño 0.
     */
    @Override
    public List<Long> addList(List<Alumno> list) {
        List<Long> listaID = new ArrayList<>();
        long id = 0;

        for (int i = 0; i < list.size(); i++) {
            try {
                id = add(list.get(i));
                if (id == -1) {
                    System.out.println("numero erroneo: " + list.get(i));
                } else {
                    listaID.add(id);
                }
            } catch (SQLException e) {
                System.out.println("error de base de datos " + list.get(i));
                e.printStackTrace();
            }
        }
        return listaID;
    }


    /**
     * Elimina el elemnto de identificador id
     *
     * @param id elemento a eliminar
     * @return Retorna el id del elemento eliminado, 0 si no existe y -1 si hubo error.
     */
    @Override
    public long del(long id) {
        String sql = "DELETE FROM alumnos WHERE id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected == 1) {
                return id;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            return -1;
        }
    }

    /**
     * Modifica el elemento alumno de identificador id. Si no existe debe crearse.
     *
     * @param id long que identifica al elemnto a modificar.
     * @param alumno  -> Elemento de tipo Alumno para modificar el que está almacenado.
     * @return Retornará 0 si se realizó correctamente, -1 si hubo un error y 1 si no existía previamente.
     */
    @Override
    public int update(long id, Alumno alumno) {
        String sql = """
                 UPDATE alumnos
                SET nombre = ?
                SET email = ?
                SET dni = ?  
                SET fechaNacimiento = ?
                WHERE id = ?  
                """;

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, alumno.getNombre());
            statement.setString(2, alumno.getEmail());
            statement.setString(3, alumno.getDni());
            statement.setString(4, alumno.getFechaNacimiento());
            statement.setLong(5, id);

            statement.executeUpdate();
        } catch (SQLException e) {
            return -1;
        }
        return 0;
    }
}