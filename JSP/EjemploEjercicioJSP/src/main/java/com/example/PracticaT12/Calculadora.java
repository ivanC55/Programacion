package com.example.PracticaT12;

import java.util.Scanner;
public class Calculadora {

    /*
     * @Author: Ivan Cerros Brioso
     * */
    public static void main(String[] args) {
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        //Variables
        String operacion;
        Pila calculadora = new Pila();
        while (true) {
            System.out.println("Teclea la operacion: ");
            operacion = sc.nextLine();
            String[] operacionSeparada = operacion.split(" ");
            //Operaciones calculadora
            for (String espacio : operacionSeparada) {
                System.out.println(espacio);
                if ("+*=f".contains(espacio)) {
                    switch (espacio) {
                        case "+":
                            calculadora.sumar();
                            break;
                        case "*":
                            calculadora.multiplicar();
                            break;
                        case "=":
                            salir = true;
                            System.out.println(calculadora.pop());
                            break;
                        case "f":
                            calculadora.factorial();
                            break;
                        default:
                            System.out.println("Introduce una operacion !!");
                            break;
                    }
                } else {
                    if (espacio.matches("[0-9.]*")) {
                        calculadora.push(calculadora.esNumero(espacio));
                    } // if captura número
                } // if captura operación
            } // for
            if (salir) { break;}
        } // while true
    }
}


