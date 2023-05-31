package com.example.practicajsp;
import java.util.Stack;
/*
 * @Author: Ivan Cerros Brioso
 * */
public class Pila {
    Stack<Integer> pila = new Stack<Integer>();
    //Constructor :
    public Pila() {
    }

    public void push(int numero) {
        pila.push(numero);
    }

    public int esNumero(String cadena) {
        if (cadena.matches("[0-9.]*")) {
            int cadenaInt = Integer.parseInt(cadena);
            return cadenaInt;
        }
        return 1;
    }

    public int pop() {
        if (pila.empty()) {
            System.out.println("Pila vacia");
        }
        return pila.pop();
    }
    /**
     * Suma los dos números del tope de la pila y devuelve el resultado.
     * @return el resultado de la suma de los dos números del tope de la pila.
     */
    public int sumar() {
        int numero1 = pop();
        int numero2 = pop();
        int resultado = numero1 + numero2;
        push(resultado);
        return numero1 + numero2;
    }

    /**
     * Multiplica los dos números del tope de la pila y devuelve el resultado.
     * @return el resultado de la multiplicación de los dos números del tope de la pila.
     */
    public int multiplicar() {
        int numero1 = pop();
        int numero2 = pop();
        int resultado = numero1 * numero2;
        push(resultado);
        return numero1 * numero2;
    }
}