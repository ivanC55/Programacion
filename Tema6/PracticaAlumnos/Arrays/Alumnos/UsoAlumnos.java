package Arrays.Alumnos;

public class UsoAlumnos{
    public static void main(String[] args) {
        Alumnos[] alumnos = new Alumnos[3];
        alumnos[0] = new Alumnos(1,2,3,4,5,-1);
        alumnos[1] = new Alumnos(8,-1,3,4,5,6);
        alumnos[2] = new Alumnos(7,5,3,4,5,6);

        int[] totalNotas = new int[6];

        System.out.println("       P B L F E S      M");
        for (int i = 0; i < alumnos.length; i++) {
            for(int j = 0; j < totalNotas.length; j++) {
                totalNotas[j] += alumnos[i].getNotas()[j];
            }

            System.out.print("Alumno_"+i+alumnos[i]+"\t");
            System.out.println(alumnos[i].calcularMediaAlumno());
        }
        
        
       /*  //Ejemplo:
        int[][] m = {{1,1},{0,0}};
        m[0][0]=1;
        m[0][1]=1;
        m[1][0]=0;
        m[1][1]=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }*/
    }
}