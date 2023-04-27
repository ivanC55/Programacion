import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
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
    static List<Parametros> leerParametros(File CSV, int i){
        List<Parametros> parametrosList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV))) {
            String header = br.readLine();
            String[] headerFields = header.split(",");
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length < headerFields.length) {
                    System.out.println("La línea " + line + " no contiene suficientes valores.");
                    continue;
                }
                String nombre = fields[0].trim();
                String email = fields[1].trim();
                String saldo = fields[2].trim();
                String oferta = fields[3].trim();
                Parametros parametros = new Parametros(nombre, email, saldo, oferta);
                parametrosList.add(parametros);
            }
            return parametrosList;
        }
        catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    };

    /** Método estático leerArchivo devuelve un String con el archivo completo
     *
     * @param file - File a leer
     * @return String con el contenido
     * */
    static String leerArchivo(File file){
        String linea="";
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder s = new StringBuilder();
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
                s.append(linea).append("\n");
            }
            String salida = s.toString();
            return salida;
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
        boolean correcto = true;
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