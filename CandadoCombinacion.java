package Examenes.Tema6;

import java.util.Scanner;
/*
 * @Author: Ivan Cerros Brioso 
 */

public class CandadoCombinacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CodigoSecreto numeroS;
        int dificultad;
        int salida = 0;
        String intento;

        System.out.println("Dime la dificultad: ");
        dificultad = sc.nextInt();
        numeroS = new CodigoSecreto(dificultad);

        while (salida != 4) {
            System.out.println("Dime un numero de " + dificultad + " digitos.");
            intento = sc.next();
            numeroS.convierteCodigo(intento);
            numeroS.pruebaCodigo(null);
        }

    }
}
