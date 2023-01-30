public class Borrar2 {
	public static void main(String[] args) {
		int n, i, j, repeticiones;
		i = 0;
		LeerEntrada en = new LeerEntrada();
		int[] entrada = { 1, 5, 9, 3, 45, 23, 45, 12, 87, 9, 6, 5 };
		TrabajarArrays t = new TrabajarArrays();
		t.imprimirArray(entrada);
		n = en.leerE();// metemos el numero a borrar
		repeticiones = t.buscarRepeticiones(entrada, n);// numero que debemos restar al array de salida.
		int[] salida = new int[entrada.length - repeticiones];
		do{
		System.out.println(en.continuar());
		for (int numero : entrada) {
			if (n != numero) {
				salida[i] = numero;
				i++;
			}
		}}
		}
		t.imprimirArray(salida);
		System.out.println(en.continuar());
	}
}
