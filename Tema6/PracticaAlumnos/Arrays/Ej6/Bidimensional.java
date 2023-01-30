package Ej6;

import java.util.Scanner;

public class Bidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comensales;
        String menus[] = { "Menu Macarrones", "Menu Tacos", "Menu Hamburguesa" };
        // Salida :
        System.out.println("Introduce el numero de comensales(5 max):");
        comensales = sc.nextInt();
        if (comensales < 6 && comensales > 0) {
            for (int i = 0; i < comensales; i++) {
                System.out.println("Dime tu menu:\nMenu 1\nMenu 2\nMenu 3");
                int respuesta = sc.nextInt();
                System.out.println("Menu elegido: " + menus[respuesta - 1]);
            }
            System.out.println("Menu elegido");

        }
        System.out.println("Menu comensal 1");
        System.out.println("Menu comensal 2");
        System.out.println("Menu comensal 3");
    }
}
