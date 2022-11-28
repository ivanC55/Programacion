import java.util.Scanner;
public class LeerEntrada{
Scanner sc = new Scanner(System.in);
	public int leerE(){
	int e;
	System.out.println("Dime un numero:");
	e = sc.nextInt();
	return e;
}
	public String cabecera(){
	return " Producto —Unidades —Precio/unidad —Total "+
		"\n--------------------------------------------";
	}
	
}
