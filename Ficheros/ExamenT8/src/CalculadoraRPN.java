import java.util.Scanner;
/*
 * @Author: Ivan Cerros Brioso
 * */
public class CalculadoraRPN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        String operacion;
        Pila pila = new Pila();
        System.out.println("Teclea la operacion: ");
        operacion = sc.nextLine();
        String[] operacionSeparada = operacion.split(" ");
        //
        for (String espacio : operacionSeparada) {
            System.out.println(espacio);
            if ("+*=f".contains(espacio)){
                switch (espacio){
                    case "+":
                        pila.sumar();break;
                    case "*":
                        pila.multiplicar();break;
                    case "=":
                        System.out.println("Total = "+pila.pop());break;
                    case "f":
                        pila.factorial();
                    default:
                        System.out.println("Introduce una operacion !!");break;
                }
            }else{
                if (espacio.matches("[0-9.]*")){
                    pila.push(pila.esNumero(espacio));
                }
            }

        }


    }
}
