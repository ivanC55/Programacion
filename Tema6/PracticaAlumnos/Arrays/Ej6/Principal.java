package Ej6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String solicitud;
        int[] notas = { 1, 5, 8, 4, 7 };
        // Nombres introducidos por teclado:
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Dime el nombre del alumno en la posicion " + i + ": ");
            nombres[i] = sc.next();
        }
        System.out.println("Dime el nombre del alumno:");
        solicitud = sc.next();
        for (int i = 0; i < nombres.length; i++) {

            if (solicitud.equals(nombres[i])) {
                System.out.println("------------------------------------Alumno: " + nombres[i] + "\nNota: " +notas[i]);break;
            } else {
                System.out.println("Error!!!");
            }
        }

    }
}
