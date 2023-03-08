import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int media = 0;
        String numero;
        List<String> listaEnteros = new ArrayList<>();
        do {
            System.out.println("Escribe numeros : \nEscribe -> q para salir : ");
            numero = sc.next();
            if (!numero.equals("q")){
                listaEnteros.add(numero);
                int num = Integer.parseInt(numero);
                total += num;
                //Coger solo los pares y colocarlos en su posicion
                if ((num % 2) == 0){

                }else{

                }
            }else{
                listaEnteros.add(numero);
                listaEnteros.remove(numero);
                System.out.println();
            }
        }while(!numero.equals("q"));
        for (String num : listaEnteros) {
            System.out.println(num);
        }
        System.out.println("El total es "+ total);
        System.out.println("La media es "+ (total/listaEnteros.size()));


    }
}
