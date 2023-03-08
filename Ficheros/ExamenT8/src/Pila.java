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
    //Factorial n > 1 => f(n) = n * f(n-1);
    // n = 1 => f(1) = 1;
    public int factorial(int n){
        if(n > 1){
            return n*factorial(n-1);
        }else{
            return 1;
        }
        /*
        int numero = pop();
        int cuenta = 0;
        for (int i = numero; i > 0 ; i--) {
            cuenta = numero * i;
        }
        push(cuenta);
        return cuenta;
    }*/
    public int sumar() {
        int numero1 = pop();
        int numero2 = pop();
        int resultado = numero1 + numero2;
        push(resultado);
        return numero1 + numero2;
    }

    //
    public int multiplicar() {
        int numero1 = pop();
        int numero2 = pop();
        int resultado = numero1 * numero2;
        push(resultado);
        return numero1 * numero2;
    }
}
