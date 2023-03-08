import java.util.ArrayList;
import java.util.Scanner;
/**
 *@Author: Iván Cerros Brioso
 * Practica de media de notas utilizando colecciones
 */

public class EvaluacionResultados {
    public static void main(String[] args) {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        float nota = 0;
        ArrayList<Float> alumno1 = new ArrayList<>();
        ArrayList<Float> alumno2 = new ArrayList<>();
        ArrayList<Float> alumno3 = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Nota " + i + " alumno1 :");
            nota = sc.nextFloat();
            if (nota != -1) alumno1.add(nota);
            System.out.println("Nota " + i + " alumno2 :");
            nota = sc.nextFloat();
            if (nota != -1) alumno2.add(nota);
            System.out.println("Nota " + i + " alumno3 :");
            nota = sc.nextFloat();
            if (nota != -1) alumno3.add(nota);
        }
        System.out.print("          Prog  Bd   Lm   Fol   Ent   Sis || Media\n");
        System.out.println(
                          "Alumno 1 :" + alumno1 + "\t||  " + calcularMediaAlumno(alumno1) +
                        "\nAlumno 2 :" + alumno2 + "\t||  " + calcularMediaAlumno(alumno2) +
                        "\nAlumno 3 :" + alumno3 + "\t||  " + calcularMediaAlumno(alumno3));
        System.out.print("Media :   ");
        calcularMediaModulo(alumno1,alumno2,alumno3);

    }
    //Metodos
    static float calcularMediaAlumno(ArrayList<Float> notas){
        float contador = notas.size();
        float total = 0;
        float mediaAlumno = 0;
        for (int i = 0; i < notas.size(); i++) {
            total += notas.get(i);
        }
        mediaAlumno = total/contador;
        return mediaAlumno;
    }
    public static void calcularMediaModulo(ArrayList<Float> nota1,ArrayList<Float> nota2,ArrayList<Float> nota3){
        float total = 0;
        float media = 0;
        float contador = 0;
        for (int i = 0; i < 6; i++) {
            total = 0;
            contador = 0;
            if (nota1.get(i) == -1) {
                total = total;
            }else{
                total += nota1.get(i);
            }
            if (nota1.get(i) == -1) {
                total = total;
            }else{
                total += nota1.get(i);

                contador++;
            }
            if (nota1.get(i) == -1) {
                total = total;
            }else{
                total += nota1.get(i);
                contador++;
            }

            media = total/contador;
            System.out.print(media+"  ||  ");
        }
    }
}