public class Foreach{
public static void main (String[] args){
	String[] array = {"esto","es","un","array"};
	int i=0;
	for(String palabra : array){
		System.out.println("El valor de la posicion "+i+" es "+palabra);
		i++;
	}
}
}
