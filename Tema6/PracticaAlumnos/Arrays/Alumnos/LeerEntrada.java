package Arrays.Alumnos;
import java.util.Scanner;
public class LeerEntrada {
            Scanner sc = new Scanner(System.in);
            public int leerE(){
            int e = 0;
            System.out.println("Dime un numero a introducir:");
            return e;
            }
            public String leerS(){
            String s;
            System.out.println("Dime una palabra :");
            s = sc.nextLine();
            return s;
            }
}
