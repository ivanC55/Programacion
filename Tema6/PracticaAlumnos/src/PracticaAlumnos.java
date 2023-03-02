import java.util.Scanner;
/*
 *   @Author:Ivan Cerros Brioso
 * Ejercicio matriz hardcodeada en el cual buscaremos las medias de cada fila y columna y mostraremos la tabla generada.
 */


public class PracticaAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] notasAlumnos = {
                                  {-1, -1, -1, 10, 5, -1},
                                  {5, 4, -1, -1, 5, 6},
                                  {3, -1, 8, -1, -1, 8}
                                 };
        //Imprimimos la matriz con las medias incluidas:
        System.out.print("      \t\tProg\t Bd \tLm\t Fol\t Ent\t Sis\t|| Media\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("Alumno " + i + " ");
            for (int j = 0; j < 6; j++) {
                if (j < 5) {
                    System.out.print(" " + notasAlumnos[i][j] + "\t");
                } else {
                    System.out.print(notasAlumnos[i][j] + " \t|| " + calcularMediaAlumno(notasAlumnos, i) + "  ");
                }
            }

            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Medias :\t" + calcularMediaModulo(notasAlumnos, 0) + "\t\t" + calcularMediaModulo(notasAlumnos, 1) +
                "\t\t" + calcularMediaModulo(notasAlumnos, 2) + "\t\t" + calcularMediaModulo(notasAlumnos, 3) +
                "\t" + calcularMediaModulo(notasAlumnos, 4) + "\t\t" + calcularMediaModulo(notasAlumnos, 5));


    }

    //Instanciamos metodos para calcular las diferentes medias:
    public static float calcularMediaAlumno(float[][] notas, int fila) {
        float total = 0;
        float cont = 6;
        float mediaAlumno = 0;
        for (int j = 0; j < notas[0].length; j++) {
            if (notas[fila][j] > 0) {
                total = total + notas[fila][j];
            } else {
                cont--;
            }
        }
        mediaAlumno = total / cont;
        return mediaAlumno;
    }

    public static float calcularMediaModulo(float[][] modulo, int columna) {
        float contAlumnos = 3;
        float total = 0;
        float mediaModulo = 0;
        for (int i = 0; i < modulo.length; i++) {
            if (modulo[i][columna] > 0) {
                total += modulo[i][columna];
            } else {
                contAlumnos--;
            }
        }
        mediaModulo = total / contAlumnos;
        return mediaModulo;
    }

}

