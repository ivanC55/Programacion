import java.util.Stack;

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

    //
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
