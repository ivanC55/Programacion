public class For{
public static void main (String [] args){
	String[] cadena = new String[3];
	cadena[0]="esto";
	cadena[1]="es";
	cadena[2]="un";
	cadena[3]="array";
	for(int i = 0;i < cadena.length;i++){
		System.out.println("El valor de la pos "+i+" es "+cadena[i]);
	}
}
}
