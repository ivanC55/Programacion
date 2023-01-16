//package Examenes.Tema6;
/*
 * @Author: Ivan Cerros Brioso
 */
import java.util.Random;

public class CodigoSecreto {
    private int[] codigo;
    private Random rand = new Random();

    CodigoSecreto(int digitos) {
        codigo = new int[digitos];
        for (int i = 0; i < codigo.length; i++) {
            int numeroAleatorio = (int) (Math.random() * 9 + 1);
            codigo[i] = numeroAleatorio;
        }
        for(int i: codigo) { System.out.println("-"+i+"-"); }
    }

    public int[] convierteCodigo(String s) {
        int entero;
        int[] aux = new int[codigo.length];
        for (int i = 0; i < codigo.length; i++) {
            entero = Integer.parseInt(s);
            aux[i] = entero;
        }
        return aux;
    }

    public boolean pruebaCodigo(int[] c) {
        boolean correcto = false;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == codigo[i]) {
                System.out.print("=");
            } else if (c[i] > codigo[i]) {
                System.out.print("M");
            } else {
                System.out.println("m");
            }
        }
        return correcto;
    }
}
