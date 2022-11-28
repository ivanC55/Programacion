public class TrabajarArrays {
	public int buscarRepeticiones(int[] entrada, int n) {
		int i = 0;
		for (int numero : entrada) {
			if (numero == n) {
				i++;
			}
		}
		int repeticiones = i;
		System.out.println(n + " aparece " + repeticiones + " veces.");
		return repeticiones;
	}

	public void imprimirArray(int[] array) {
		System.out.print("Salida{ ");
		for (int j = 0; j < array.length; j++) {
			if (j == array.length - 1) {
				System.out.println(array[j] + " } \n");
			} else {
				System.out.print(array[j] + "-");
			}
		}
	}

}
