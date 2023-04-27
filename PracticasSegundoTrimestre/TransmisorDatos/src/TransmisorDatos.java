import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TransmisorDatos {
    public static void main(String[] args) {
        //Declaracion variables:
        String archivo = "tramas.txt";
        int tamanioTrama = 60;
        int lineaTrama = 1;
        //Contador:
        int caracteres = 0;
        StringBuilder contenidoTrama = new StringBuilder();

        //Leemos archivo:
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            // Leer archivo caracter por caracter
            int c;

            while ((c = br.read()) != -1) {
                // Incrementar contador
                caracteres++;

                // Agregar caracter a la trama
                char caracter = (char) c;
                contenidoTrama.append((caracter == '\n')?"\\n": (caracter == '\r')? "\\r": caracter);

                // Si tamaño maximo de trama, crear Trama y reiniciar
                if (caracteres == tamanioTrama) {
                    Trama trama = new Trama(contenidoTrama.toString(), lineaTrama);
                    System.out.println("\n"+trama);
                    //Esperamos 2 segundos
                    Thread.sleep(2000);
                    lineaTrama++;
                    caracteres = 0;
                    contenidoTrama = new StringBuilder();
                }
            }

            // Si quedan caracteres por agregar , crear objeto con esos caracteres
            if (caracteres > 0) {
                Trama trama = new Trama(contenidoTrama.toString(), lineaTrama);
                System.out.println(trama);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}