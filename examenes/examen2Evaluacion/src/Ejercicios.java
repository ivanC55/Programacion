import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicios {

    public static void main(String[] args){
        // Para probar los métodos

        System.out.println("Ejercicio 1:\n...................");
        char[][] matrizEntrada = {{'1', 'c', 'a'},
                {'a', '2', '1'},
                {'a', '2', 'c'}};
        int[][] matrizSalida;

        /*
        matrizSalida = obtenerEnteros(matrizEntrada);
        for (int[] fila: matrizSalida) {
            for (int celda: fila) {
                System.out.print(" "+celda+" ");
            }
            System.out.println();
        }
        */
        int[] desordenados = { 2, 8, 1, 19, 1, 24};
        ordenar(desordenados);

        for (int celda: desordenados) {
            System.out.print(" "+celda+" ");
        }
        System.out.println();


        System.out.println("\n\n\nEjercicio 2:\n...................");
        String textoEnClaro = "¿Como llevo el examen? ... chrf cnerpr dhr inf OVRA.";

        //System.out.println( rot13(textoEnClaro) );



        System.out.println("\n\n\nEjercicio 3:\n...................");
        System.out.println( "Lleva: " + registrarFalta("Luis", "12-03-2023") + " faltas.");
        System.out.println( "Lleva: " + registrarFalta("Luis", "13-03-2023") + " faltas.");
        System.out.println( "Lleva: " + registrarFalta("Luis", "14-03-2023") + " faltas.");
        System.out.println( "Lleva: " + registrarFalta("Pedro", "12-03-2023") + " faltas.");

        System.out.println( mostrarFaltas("Luis") + " y " + mostrarFaltas("Pedro"));



        System.out.println("\n\n\nEjercicio 4:\n...................");
        String texto = "Esto esta bien escrito y leído.\nAdios.";
        /*
        ArchivoDaoImp deArchivos = new ArchivoDaoImp();
        deArchivos.writeAll("archivoEscrito.txt", texto);
        System.out.println( deArchivos.getAll("archivoEscrito.txt") );
         */
        try {
            System.out.println("Se han escrito " + writeAll("archivo.txt", texto) + " caracteres.");
            System.out.println("Y leemos...\n" + getAll("archivo.txt"));
        } catch (Exception e) { e.printStackTrace(); }

    }



    /*public static void main(String[] args) {
        int [] a = {10,9,5,11,30,1};
        ordenar(a);
        for ( int i : a ) {
            System.out.print(i + ",\t");
        }
    }*/
    //Ejercicio 1:
     static void ordenar(int[] vector){
        int cuentaIntercambios = 0;
        for (boolean ordenado = false; !ordenado;){
            for (int i = 0; i < vector.length-1;i++){
            if (vector[i] > vector[i + 1]){
                int aux =vector[i];
                vector[i]=vector[i + 1];
                vector[i + 1]=aux;
                cuentaIntercambios++;
            }//fin if
            }//Si no hay intercambios esta ordenado
            if (cuentaIntercambios == 0){
                ordenado = true;
            }//Lo ponemos a cero para que a cada vuelta este correcto
            cuentaIntercambios = 0;
        }//fin for
    }
    //fin ejercicio 1
    //Ejercicio 4:
    static String getAll(String rutaCompletaArchivo) throws IOException {
        File f = new File(rutaCompletaArchivo);
        try (BufferedReader br = new BufferedReader(new FileReader(f))){
           String linea;
           //Si siguen habiendo lineas sigue leyendo
           while ((linea = br.readLine()) != null){
                return linea;
                // Sólo lees la primera línea
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "Error";
    }
    static int writeAll(String rutaCompletaArchivo,String texto){
        File f = new File(rutaCompletaArchivo);
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.flush();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return texto.length();
    }
    //Fin ejercicio 4
    //Ejercicio 3:
    static int registrarFalta(String nombre,String fecha){
        Map<String,String> faltas = new HashMap<>();
        faltas.put(nombre,fecha);
        return 1;
    }
    static String mostrarFaltas(String nombre){
        List<String> listaFaltas = new ArrayList<>();
        listaFaltas.add(nombre);
        return nombre;
    }
}
