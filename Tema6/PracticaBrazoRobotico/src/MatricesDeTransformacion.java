import java.util.Scanner;
public class MatricesDeTransformacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1;
        int c2;
        /*
        matriz[0][0] = "0,0";
        matriz[0][1] = "0,1";
        matriz[0][2] = "0,2";
        matriz[1][0] = "1,0";
        matriz[1][1] = "1,1";
        matriz[1][2] = "1,2";
        matriz[2][0] = "2,0";
        matriz[2][1] = "2,1";
        matriz[2][2] = "2,2";
        */
        cinematicaInversa(1,1);
        System.out.println();System.out.println("Elige una coordenada");
        c1=sc.nextInt();
        c2=sc.nextInt();
        //System.out.println("Coordenada elegida : "+matriz[c1][c2]);

    }
    static float[][] cinematicaInversa(int x, int y){
        Scanner sc = new Scanner(System.in);
        float matriz [][] = new float[10][10];
        for (int i = matriz.length-1; i >= 0; i--){
            System.out.println();
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=Float.parseFloat(i+","+j);
                System.out.print(matriz[i][j]+"\t");
            }
        }
        System.out.println();System.out.println("Elige una coordenada");
        float c1=sc.nextFloat();
        float c2=sc.nextFloat();
        return matriz[c1][c2];
    }
}
