import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    //Con formato general
    //Para MAriaDB
    //"?useLegacyDateTimeCode=false&serverTimeZone=Europe/Madrid"
    //1º Credenciales de acceso => Crear URI
    private static String user = "root";
    private static String passwd = "";
    private static String ip = "127.0.0.1";
    private static int port = 3306;
    private static String db = "nombre_bd";
    static String URI = "jdbc:mysql://" + user + ":" + passwd + "@" + ip + ":" + port + "/" + db + "?useLegacyDateTimeCode=false&serverTimeZone=Europe/Madrid";

    public static void main(String[] args) {
        //Declaracion variables
        Scanner sc = new Scanner(System.in);
        Statement stmt;
        ArrayList<Alumno> alumnos = new ArrayList<>();
        //TableFormatter tf = ;
        //Consulta SQL
        String sql = "SELECT * FROM alumnos";
        //try con recursos
        //Hacemos la conexion
        try (Connection conn = DriverManager.getConnection(URI)) {
            //Creamos la sentencia
            stmt = conn.createStatement();
            //Muestra resultado de la busqueda pedida
            ResultSet rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<Alumno> getAlumnos() {
        String sql = "SELECT * FROM alumnos WHERE nombre = ?";
        PreparedStatement stmt = null;
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URI)) {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "id");
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                alumnos.add(new Alumno(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getString("primerApellido"),
                        rs.getString("segundoApellido")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
