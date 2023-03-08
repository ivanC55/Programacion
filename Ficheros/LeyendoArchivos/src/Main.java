import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String separadorSistema = System.getProperty("file.separator");
        String archivoALeer = "prueba.txt";
        String rutaArchivo = System.getProperty("user.dir") + separadorSistema;
        mainScanner(archivoALeer);
        mainScannerFileReader(archivoALeer);
        mainFileReader(archivoALeer);
        mainBufferedReader(archivoALeer);
        mainScannerBufferedReader(archivoALeer);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    public static void mainScanner(String archivo) throws Exception {
        File file = new File(archivo);
        Scanner sc = new Scanner(file);
        System.out.println("Leyendo fichero con Scanner\n------------------------------------");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

    public static void mainScannerFileReader(String archivo) throws Exception {
        Charset ascii = Charset.forName("UTF8");
        FileReader fr = new FileReader(archivo);
        Scanner sc = new Scanner(fr);
        System.out.println("---------------------------------\nLeyendo fichero con Scanner FileReader\n---------------");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }

    //FileReader
    public static void mainFileReader(String archivo) {
        File file = new File(archivo);
        System.out.println("\n\nLeyendo con FileReader\n");
        try (FileReader fr = new FileReader(archivo)) {
            int contenido;
            while ((contenido = fr.read()) != -1) {
                System.out.print((char) contenido);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Buffered con scanner
    public static void mainScannerBufferedReader(String archivo) throws Exception {
        File file = new File(archivo);

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        Scanner sc = new Scanner(br);
        System.out.println("\n\nLeyendo con Scanner BufferedReader\n");
        try {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    //BufferedReader
    public static void mainBufferedReader(String archivo) throws Exception {
        File file = new File(archivo);
        System.out.println("\n\nLeyendo con BufferedReader\n");
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
