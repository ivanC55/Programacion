import java.math.BigDecimal;
import java.util.Stack;

public class Pila2 {
    //Pop --> Elimina el ultimo elemento introducido en la pila y lo muestra si haces sout
    //Push --> Añade un elemento al final de la pila
    //Peek --> Muestra el ultimo elemento de la pila
    //Empty --> Comprueba si la pila esta vacia
    public static void main(String[] args) {


    }
    public static float evaluar(String calculo){
        Pila pila = new Pila();
        String[] calculos = calculo.split(" ");
        for (String entrada:calculos) {
            if ("+*".contains(entrada)){
                switch (entrada){
                    case "+": pila.sumar();break;
                    case "*": pila.multiplicar();break;

                }
            }else{
                if(esNumero(entrada)){
                    //pila.push(entrada);
                }else{
                    System.out.println("Error");
                }
            }
        }

        return 2F;
    }
    public static boolean esNumero(String cadena){
        if (cadena.matches("[0-9.]*")){
         //cadena
        }
        return true;
    }
}
