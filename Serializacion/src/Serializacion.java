import java.io.*;
import java.util.ArrayList;

public class Serializacion {
    private static final long serialVersionUID = 5L;

    public static void main(String[] args) {
        String separadorSistema = System.getProperty("file.separator");
        String archivo = "alumnos.dat";
        String rutaArchivo = System.getProperty("user.id") + separadorSistema;

        //Creación y objetos del ArrayList
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno(20, "Antonio", "daw"));
        alumnos.add(new Alumno(21, "Cesar", "dam"));
        alumnos.add(new Alumno(22, "Jorge", "asir"));
        DAOAlumnosImp dao = new DAOAlumnosImp();
        dao.escribirObjetos(alumnos,archivo);
        dao.leerObjeto(alumnos,archivo);
    }




}

