import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
//Hay que añadir una linea con una lista
//1.- Hacer una lista para guardar las lineas
//2.- Añadir las lineas a la lista
//3.- Borrar la linea uno
//4.- Mostrar lista entera
public class Escribiendo {
    public static void main(String[] args) throws Exception{
        String separadorSistema = System.getProperty("file.separator");
        //user.home donde esta tu carpeta home
        //String archivoAEscribir = "C:\\Users\\inaki\\Desktop\\Daw1\\PROG\\Clase\\Ficheros\\LeyendoArchivos\\prueba2.txt";
        String rutaArchivo = System.getProperty("user.dir") + separadorSistema;
        String archivoAEscribir = "prueba2.txt";

        //Damos la ruta y luego creamos el archivoAEscribir
        fileWriter(rutaArchivo + archivoAEscribir);
        bufferedWriter(rutaArchivo + archivoAEscribir);
    }

    public static void fileWriter(String archivo) {
        try {
            FileWriter fw = new FileWriter(archivo,true);
            fw.write("Escribiendo con fileWriter\n");
            fw.write("línea 1\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void bufferedWriter(String archivo) {
        File file = new File(archivo);
        try {
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Escribiendo con bufferedWriter");
            bw.newLine();
            bw.write("linea 2");
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void mainWriteString(String archivo,String ruta){
        Path path = Paths.get("C:\\Users\\inaki\\Desktop\\Daw1\\PROG\\Clase\\Ficheros");
        try
        {
            //Escribimos el contenido
            path=Files.writeString(path,"Hello World !!", StandardOpenOption.APPEND);
            String content = Files.String(path);
            System.out.println(content);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
