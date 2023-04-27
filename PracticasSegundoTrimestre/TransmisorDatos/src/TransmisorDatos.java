import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TransmisorDatos {
    public static void main(String[] args) {
        String archivo;
        int tamanioTrama, lineaTrama, caracteres;
        StringBuilder contenidoTrama;

        archivo = "tramas.txt";

        tamanioTrama = 60;
        lineaTrama = 1;
        caracteres = 0;
        contenidoTrama = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            // Leer archivo caracter por caracter

            int c;

            while ((c = br.read()) != -1) {
                // Incrementar contador de caracteres
                caracteres++;

                // Agregar caracter a la trama
                char cha = (char) c;
                contenidoTrama.append((cha == '\n')?"\\n": (cha == '\r')? "\\r": cha);

                // Si llegamos al tamano maximo de la trama, crear objeto Trama y reiniciar variables
                if (caracteres == tamanioTrama) {
                    Trama trama = new Trama(contenidoTrama.toString(), lineaTrama);
                    System.out.println("\n"+trama);
                    Thread.sleep(2000);
                    lineaTrama++;
                    caracteres = 0;
                    contenidoTrama = new StringBuilder();
                }
            }

            // Si quedan caracteres por agregar a la trama, crear objeto Trama con esos caracteres
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