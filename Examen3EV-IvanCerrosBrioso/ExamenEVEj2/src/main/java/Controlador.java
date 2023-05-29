import java.sql.SQLException;
import java.util.Scanner;
/**
 * @Author Ivan Cerros Brioso
 * */

public class Controlador {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        DAO dao = new DAOImpBBDD();
        System.out.println("Nombre a buscar : ");
        String nombre = sc.next();
        System.out.println(dao.getByNombre(nombre));
        System.out.println("ID a buscar :");
        long id = sc.nextLong();
        System.out.println(dao.updateById(id));
    }
}
