public class Matriz {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        for (int x = 0; x < 3; x++) {
            matriz[x][0] = x; System.out.println();
            for (int y = 0; y < 3; y++) {
                matriz[x][y] = y; System.out.print("  " + y + ", " + x + "  ");
            }
        }
    }
}
