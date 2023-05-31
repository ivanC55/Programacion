package com.example.practicajsp;

import java.util.Scanner;

public class CalculadoraPila {
    public int imprimirResultado(String texto) {

        // Variables
        int resultado = 0;
        Pila pila = new Pila();
        String[] operacionSeparada = texto.split(" ");

        for (String espacio : operacionSeparada) {
            if ("+*=".contains(espacio)) {
                switch (espacio) {
                    case "+":
                        pila.sumar();
                        break;
                    case "*":
                        pila.multiplicar();
                        break;
                    case "=":   // delimitador final
                        resultado = pila.pop();
                        break;
                    default:
                        System.out.println("Introduce una operacion !!");
                        break;
                }
            } else {
                if (espacio.matches("[0-9.]*")) {
                    pila.push(pila.esNumero(espacio));
                }
            }

        }

        return resultado;
    }
}
