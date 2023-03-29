import java.io.*;
import java.util.ArrayList;

public class DAOAlumnosImp implements DAOAlumnos {
    private static final long serialVersionUID = 5L;
    public static void escribirObjetos(ArrayList<Alumno> alumnos, String archivo) {
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream salida = new ObjectOutputStream(fos);
            for (Alumno alumno : alumnos) {
                //String datos = alumno.toString();
                //byte codigos[] = datos.getBytes();
                salida.writeObject(alumno.toString());
            }
            fos.close();
            salida.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void leerObjeto(ArrayList<Alumno> alumnos , String archivo) {
        //Leer con FileInputStream
        try (FileInputStream fis = new FileInputStream(archivo)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            int valor = fis.read();
            while (valor != -1) {
                System.out.print((char) valor);
                valor = fis.read();
            }
            //for (Alumno alumno : alumnos) {
              //  alumno = (Alumno) ois.readObject();
            //}
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public ArrayList<Alumno> getAllAlumnos() {
        return null;
    }
}
