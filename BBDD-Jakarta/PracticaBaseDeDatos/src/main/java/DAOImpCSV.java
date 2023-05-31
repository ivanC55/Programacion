/**
 *
 * @Author: Iván Cerros Brioso
 *
 * */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DAOImpCSV implements DAO {
    /**
     * Obtiene el elemento indicado por su id
     *
     * @param id de tipo long
     * @return Objeto de la clase T
     */
    @Override
    public Object getById(long id) {

        return null;
    }

    /**
     * Obtiene una lista con TODOS elementos de T
     *
     * @return List<T>
     */
    @Override
    public List getAll() {
        List<Alumno> alumnos = leerFichero();
        return alumnos;
    }

    /**
     * Inserta un nuevo elemento T
     *
     * @param e de tipo T
     * @return (tipo long) id del elemento insertado o -1 si se produjo algún error.
     */
    @Override
    public long add(Object e) {

        return 0;
    }

    /**
     * Inserta una coleción completa de T
     *
     * @param list@return List<long> con una lista de todos los id's o -1 si se produjo error al insertar elementos. Si no hubo
     *                    error, pero no se insertó ninguno se devuelve una List de tamaño 0.
     */
    @Override
    public List<Long> addList(List list) {

        return null;
    }

    /**
     * Elimina el elemnto de identificador id
     *
     * @param id elemento a eliminar
     * @return Retorna el id del elemento eliminado, 0 si no existe y -1 si hubo error.
     */
    @Override
    public long del(long id) {
        return 0;
    }

    /**
     * Modifica el elemento e de identificador id. Si no existe debe crearse.
     *
     * @param id long que identifica al elemnto a modificar.
     * @param e  -> Elemento de tipo T para modificar el que está almacenado.
     * @return Retornará 0 si se realizó correctamente, -1 si hubo un error y 1 si no existía previamente.
     */
    @Override
    public int update(long id, Object e) {
        return 0;
    }

    private static List<Alumno> leerFichero() {
        FileReader fr = null;
        try {
            fr = new FileReader("alumnos.csv");
            BufferedReader br = new BufferedReader(fr);
            String encabezado = br.readLine();
            String[] atributos = encabezado.split(",");
            String linea;
            String[] alumnosAtributos;
            List<Alumno> fichero = new ArrayList<>();
            while((linea = br.readLine())!=null) {
                Long id = null;
                String nombre="";
                String email="";
                String dni="";
                String fechaNacimiento="";
                alumnosAtributos = linea.split(",");
                for(int i=0; i<alumnosAtributos.length; i++) {
                    id = (long) i;
                    switch(atributos[i].trim()) {
                        case "nombre":
                            nombre = alumnosAtributos[i].trim();
                            break;
                        case "email":
                            email = alumnosAtributos[i].trim();
                            break;
                        case "dni":
                            dni = alumnosAtributos[i].trim();
                            break;
                        case "fechaNacimiento":
                            fechaNacimiento = alumnosAtributos[i].trim();
                            break;
                    }
                }
                fichero.add(new Alumno( nombre, email, dni, fechaNacimiento));
            }

            return fichero;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
