import java.util.Scanner;

public class CalculadoraRPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        String operacion;
        Pila pila = new Pila();
        System.out.println("Teclea la operacion: ");
        operacion = "1 2 + 3 * 5 +";
        String[] operacionSeparada = operacion.split(" ");
        //
        for (String espacio : operacionSeparada) {
            System.out.println(espacio);
            if ("+*".contains(espacio)){
                switch (espacio){
                    case "+":
                        System.out.println("\n"+pila.sumar()+"\n\n");;break;
                    case "*":
                        System.out.println("\n"+pila.multiplicar()+"\n");break;
                }
            }else{
                if (espacio.matches("[0-9.]*")){
                    pila.push(pila.esNumero(espacio));
                }
            }

        }


    }
}
