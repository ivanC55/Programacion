package Arrays.Alumnos;

public class Alumnos {
    private int[] notas = new int[6];

    // Variables:
    /*private int prog;
    private int bbdd;
    private int ldm;
    private int fol;
    private int ed;
    private int si;*/

    public Alumnos(int prog, int bbdd, int ldm, int fol, int ed, int si) {
        notas[0] = prog;
        notas[1] = bbdd;
        notas[2] = ldm;
        notas[3] = fol;
        notas[4] = ed;
        notas[5] = si;
    }

    // Metodos Getters:
    public int[] getNotas() {
        return notas;
    }

    public int getProg() {
        return notas[0];
    }

    public int getBbdd() {
        return notas[1];
    }

    public int getLdm() {
        return notas[2];
    }

    public int getFol() {
        return notas[3];
    }

    public int getEd() {
        return notas[4];
    }

    public int getSi() {
        return notas[5];
    }

    // Metodos Setters:

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public void setProg(int prog) {
        notas[0] = prog;
    }

    public void setBbdd(int bbdd) {
        notas[1] = bbdd;
    }

    public void setLdm(int ldm) {
        notas[2] = ldm;
    }

    public void setFol(int fol) {
        notas[3] = fol;
    }

    public void setEd(int ed) {
        notas[4] = ed;
    }

    public void setSi(int si) {
        notas[5] = si;
    }

    public int calcularMediaAlumno() {
        int cont = 6;
        int total = 0;
        for(int i = 0; i < this.notas.length; i++) {
            if(notas[i] < 0){
                cont--;
            }else {
                total += notas[i];
            }
        }
        return total/cont;
    }
    public int calcularMediaModulo(){
        int cont = 6;
        for (int nota : notas) {
            if (notas[nota] < 0) {
                
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        String notasString = "";
        for (int i = 0; i < this.notas.length; i++) {
            notasString += " " + notas[i];
        }
        return notasString;
    }

}
