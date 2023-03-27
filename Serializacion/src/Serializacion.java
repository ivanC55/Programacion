import java.io.*;
import java.util.ArrayList;

public class Serializacion {
    public static void main(String[] args) {
        String separadorSistema = System.getProperty("file.separator");
        String archivo = "alumnos.dat";
        String rutaArchivo = System.getProperty("user.id") + separadorSistema;
        //Creación y objetos del ArrayList
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(20, "a1", "daw"));
        alumnos.add(new Alumno(21, "a2", "dam"));
        alumnos.add(new Alumno(22, "a3", "asir"));
        //Escribir con FileOutputStream
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream salida = new ObjectOutputStream(fos);
            for (Alumno alumno : alumnos) {
                //String datos = alumno.toString();
                //byte codigos[] = datos.getBytes();
                salida.writeObject(alumno.toString());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Leer con FileInputStream
        try (FileInputStream fis = new FileInputStream(archivo)) {
            int valor = fis.read();
            while (valor != -1) {
                System.out.print((char) valor);
                valor = fis.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
