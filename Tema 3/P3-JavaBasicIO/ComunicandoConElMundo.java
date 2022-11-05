import java.util.Scanner;
public class ComunicandoConElMundo{
public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	int op1=0;
	int op2=0;
	System.out.println("Dime el primer numero : ");
	op1=sc.nextInt();
	System.out.println("Dime el segundo numero : ");
	op2=sc.nextInt();
	System.out.println("La division es : "+(op1/op2));
	System.out.println("El resto de la divisione es : "+(op1%op2));
}
}
