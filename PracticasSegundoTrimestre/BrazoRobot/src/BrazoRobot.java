import java.util.Scanner;
/**
 *
 * @Author : Ivan Cerros Brioso
 *
 * */


public class BrazoRobot {

    static String [][] cinematicaInversa2D(int x, int y){
        //Declaracion de variables
        String[][] matriz = new String[10][10];
        //Imprimimos la matriz con dos bucles for
        for (int i = matriz.length-1; i >= 0; i--) {
            System.out.println("|---------------------------------------------------------------------------------------------------|");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[j][i] = "[ "+ j +" , "+ i +" ] ";
                System.out.print(matriz[j][i]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Las coordenadas dadas corresponden a :");
        System.out.println(matriz[x][y]);
        return matriz;
    }

    public static void main(String[] args) {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int coordenada1 = 0;
        int coordenada2 = 0;
        //Damos las coordenadas
        System.out.println("Inserta la coordenada 1 : ");
        coordenada1 = sc.nextInt();
        System.out.println("Inserta la coordenada 2 : ");
        coordenada2 = sc.nextInt();

        System.out.println("Matriz :");
        cinematicaInversa2D(coordenada1,coordenada2);
    }
}