public class Ordenar {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,10,40,4,50};

    }
    static void ordenar(int[] arr){
        int cuentaIntercambios = 0;
        for (boolean ordenado = false; !ordenado){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr [ i + 1 ]){
                    int aux = arr[i];
                    arr[i] = arr [ i + i ];
                    arr [i+1]=aux;
                    cuentaIntercambios++;
                }
            }
            //Si no hay intercambios está ordenado
            if (cuentaIntercambios == 0){
                ordenado = true;
            }
            //Ponerlo a cero a cada inicio de bucle
            cuentaIntercambios = 0;
        }
    }
}
