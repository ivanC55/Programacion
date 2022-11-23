import java.util.Scanner;
public class ComunicandoConElMundo{
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_RED = "\u001B[31m";
public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	int op1=0;
	int op2=0;
	System.out.println("Dime el primer numero : ");
	op1=sc.nextInt();
	System.out.println("Dime el segundo numero : ");
	op2=sc.nextInt();
	System.out.print("La division es : ");
	System.out.println(ANSI_BLUE+(op1/op2)+ANSI_RESET);
	System.out.print("El resto de la divisione es : ");
	System.out.println(ANSI_RED+(op1%op2)+ANSI_RESET);
}
}
