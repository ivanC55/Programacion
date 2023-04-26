import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class dos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        // Solicitar los nombres de los alumnos
        System.out.println("Ingrese los nombres de los alumnos separados con comas:");
        String[] nombres = scanner.nextLine().split(",");

        // Crear un objeto Alumno para cada nombre
        for (String nombre : nombres) {
            alumnos.add(new Alumno(nombre));
        }

        // Solicitar las notas para cada módulo de cada alumno
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            System.out.println("Ingrese las notas de " + alumno.getNombre() + ":");
            for (String modulo : Alumno.MODULOS) {
                System.out.println("Nota para " + modulo + ":");
                Float nota = scanner.nextFloat();

                // No almacenar la nota si es igual a -1
                if (nota != -1) {
                    alumno.agregarNota(modulo, nota);
                }
            }
        }

        // Imprimir la evaluación de los módulos para cada alumno
        System.out.println("Evaluación :");
        System.out.print("    Prog  Bd  Lm  Fol  Ent  Sis || Media\n");
        for (Alumno alumno : alumnos) {
            System.out.print(alumno.getNombre() + "\t");
            alumno.imprimirEvaluacion();
            System.out.println();
        }

        // Calcular la media de cada módulo
        HashMap<String, Float> medias = new HashMap<String, Float>();
        for (String modulo : Alumno.MODULOS) {
            Float sum = 0f;
            int count = 0;
            for (Alumno alumno : alumnos) {
                Float nota = alumno.getNota(modulo);
                if (nota != -1) {
                    sum += nota;
                    count++;
                }
            }
            Float media = (count > 0) ? sum / count : 0;
            medias.put(modulo, media);
        }

        // Imprimir la media de cada módulo
        for (String modulo : Alumno.MODULOS) {
            if (modulo == Alumno.MODULOS[0]) System.out.print("\t" + medias.get(modulo) + "\t");
            System.out.print(medias.get(modulo) + "\t");
        }
        System.out.println();
    }}

