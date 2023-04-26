import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
public class EvaluacionResultados {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        float nota = 0;

        // Creamos el mapa de alumnos
        Map<String, Alumno> alumnos = new HashMap<>();
        alumnos.put("Alumno 1", new Alumno("Alumno 1",));
        alumnos.put("Alumno 2", new Alumno("Alumno 2"));
        alumnos.put("Alumno 3", new Alumno("Alumno 3"));

        // Pedimos las notas a través del objeto Alumno correspondiente
        for (int i = 0; i < 2; i++) {
            for (Alumno alumno : alumnos.values()) {
                System.out.println("Nota " + i + " " + alumno.getNombre() + ":");
                nota = sc.nextFloat();
                if (nota != -1) {
                    alumno.addNota(nota);
                }
            }
        }

        // Mostramos las notas y la media de cada alumno
        System.out.print("          Prog  Bd   Lm   Fol   Ent   Sis || Media\n");
        for (Alumno alumno : alumnos.values()) {
            System.out.println(alumno.toString());
        }

        // Mostramos la media del módulo
        System.out.print("Media :   ");
        calcularMediaModulo(alumnos.values());
    }

    // Método para calcular la media de un conjunto de alumnos
    static float calcularMediaAlumnos(ArrayList<Float> notas) {
        float contador = notas.size();
        float total = 0;
        float mediaAlumno = 0;
        for (int i = 0; i < notas.size(); i++) {
            total += notas.get(i);
        }
        mediaAlumno = total / contador;
        return mediaAlumno;
    }

    // Método para calcular la media de cada módulo
    public static void calcularMediaModulo(Iterable<Alumno> alumnos) {
        float[] medias = new float[6];
        int[] contadores = new int[6];
        for (Alumno alumno : alumnos) {
            ArrayList<Float> notas = (ArrayList<Float>) alumno.getNotas();
            for (int i = 0; i < 6; i++) {
                if (notas.get(i) != -1) {
                    medias[i] += notas.get(i);
                    contadores[i]++;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(medias[i] / contadores[i] + "  ||  ");
        }
    }
}*/
