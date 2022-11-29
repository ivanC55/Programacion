import java.util.Scanner;
public class Borrar{//Borrar elementos de un array e insertarlos en otro.
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int[] numeros = {1,14,3,17,5};//primer array
	int[] actualizado = new int[5];//copia
	int n = 0;//numero introducido
	int i = 0;//puntero
	System.out.println("Introduce el numero a borrar: ");
	n = sc.nextInt();
	//Comprobamos si el numero introducido esta en el array:
	for(int numero : numeros){
		if(n != numero){
		actualizado[i]=numero;
		i++;
		}
	System.out.println("k:"+i+" v:"+actualizado[i]);
	}
	//Leemos el array actualizado:
	System.out.print("actualizado = {");
	for(int j = 0; j <= actualizado.length; j++){
		System.out.print(actualizado[j]+"--");
	}

}
}
