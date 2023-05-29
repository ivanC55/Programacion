import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Ivan Cerros Brioso
 */
public class DAOImpBBDD implements DAO {
    Scanner sc = new Scanner(System.in);
    private Connection connection;

    public DAOImpBBDD() throws SQLException {
        connection = DriverManager.getConnection(Conn.getUri());
    }

    /**
     * Devuelve la persona/as que esten en la base de datos con el nombre introducido
     *
     * @param nombre de tipo String
     * @return List<Persona>
     */
    @Override
    public List<Persona> getByNombre(String nombre) throws SQLException {
        List<Persona> personas = new ArrayList<Persona>();
        String sql = "SELECT * FROM datosPersonas WHERE nombre LIKE ?";
        PreparedStatement stat = connection.prepareStatement(sql);
        stat.setString(1, nombre);
        ResultSet resultSet = stat.executeQuery();
        for (int i = 0; i < 10; i++) {
            if (resultSet.next()) {
                personas.add(new Persona(resultSet.getLong("id"), resultSet.getString("nombre")));
            }
        }
        return personas;
    }

    /**
     * Modifica los datos del alumno elegido
     *
     * @return boolean si tuvo éxito o no
     */
    @Override
    public boolean updateById(long id) {

        System.out.println("Introduce nombre por el que sustituir al usuario con id : " + id);
        String nombre = sc.next();
        String sql = "UPDATE datosPersonas SET nombre = ? WHERE id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nombre);
            statement.setLong(2, id);
            statement.executeUpdate();
            System.out.println("Cambios realizados");
            return true;

        } catch (SQLException e) {
            return false;

        }
    }
}
