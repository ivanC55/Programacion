import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * La clase TrabajarArchivo nos ofrece una capa de abstracción para leer/escribir y procesar archivos
 * */
public class TrabajarArchivo {
    /** El método stático countLines() nos devuelve el número líneas del archivo
     * @param file File que queremos contar el número de líneas
     * @return lineas. Entero con el número de líneas del archivo pasado (incluye el encabezado)
     * */
    static int countLines(File file) throws IOException {
        int lineas = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String linea;
            while((linea = br.readLine()) != null){
                lineas ++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Lineas : "+lineas);
        return lineas;
    }

    /** El método estático leerParametros nos parsea un archivo CSV y nos lo devuelve como un objeto de la clase Parametros
     *
     * @param CSV archivo CSV con los campos String nombre, email, saldo y oferta
     * @param i lee la fila i del archvivo
     * @return Parametros. Objeto con 4 atributos String (nombre, email, saldo y oferta)
     * */
    static Parametros leerParametros(File CSV, int i){
        Parametros parametros;
        try(BufferedReader br = new BufferedReader(new FileReader(CSV))){
            String linea;
            int contador = 0;
            while((linea = br.readLine()) != null){
            contador++;
            if (contador == i){
                String[] lineaSeparada = linea.split(",");
                parametros=new Parametros(lineaSeparada[0],lineaSeparada[1],lineaSeparada[2],lineaSeparada[3]);
                return parametros;
            }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * El método estático leerModulos nos parsea un archivo CSV y nos lo devuelve un array con el nombre de los módulos (primer campo vacío)
     *
     * @param CSV archivo CSV con un campo vacío (o con "nombre") y un número indefinido de columnas con el nombre de cada módulo <String>
     * @return String[].
     */
    static String[] leerModulos(File CSV){
        try {
            BufferedReader br = new BufferedReader(new FileReader(CSV));
            String linea;
            while ((linea = br.readLine()) != null){
                String[] lineaSeparada = linea.split(",");
                String [] modulos = new String[lineaSeparada.length];
                for (int i = 0; i < lineaSeparada.length; i++) {
                    modulos[i - 1] = lineaSeparada[i];
                }
                return  modulos;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * El método estático leerAlumno nos parsea un archivo CSV y nos lo devuelve un objeto de la clase Alumno
     *
     * @param CSV archivo CSV con los campos String nombre y un número indefinido de columnas con las notas de cada módulo <float>
     * @param i   lee la fila i del archvivo
     * @return Alumno. Objeto con 2 atributos nombre <String> y array notas <float>
     */
    static Alumno leerAlumno(File CSV, int i){
        int contador = 0;
        String linea;
        Alumno alumno;
        try(BufferedReader br = new BufferedReader(new FileReader(CSV))){
            while((linea = br.readLine()) != null){
                contador++;
                if (contador == i){
                    String[] lineaSeparada = linea.split(",");

                    alumno=new Alumno("",);
                    return alumno;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    /** Método estático leerArchivo devuelve un String con el archivo completo
     *
     * @param file - File a leer
     * @return String con el contenido
     * */
    static String leerArchivo(File file){
        String linea="";
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
                return linea;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /** método stático escribeArchivo
     *
     * @param texto - String con el texto a escribir
     * @param nombreArchivo - String con el nombre del archivo
     * @return boolean si todo ok o no
     */
    static boolean escribeArchivo(String texto, String nombreArchivo){
        boolean correcto=true;
        File f;
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter pw;
        try{
            f=new File(nombreArchivo);
            fw=new FileWriter(f);
            bw=new BufferedWriter(fw);
            pw=new PrintWriter(bw);

            pw.append(texto);

        } catch (IOException e) {
            System.out.println("Fallo al escribir en el archivo");
            e.printStackTrace();
            correcto = false;
        }
        return correcto;
    }
}