public class Trama {
    String Pre, SFD, DDES, DORG;
    int Long;
    String DATOS;
    int num;

    public Trama(String datos, int num) {
        Pre = "\u00AA\u00AA\u00AA\u00AA\u00AA\u00AA\u00AA";
        this.SFD = "\u00AB";
        this.DDES = "\u00FF:\u00FF:\u00FF:\u00FF:\u00FF:\u00FF";
        this.DORG = "00-15-5D-03-F8-63";
        Long = datos.length();
        this.DATOS = datos;
        this.num = num;
    }


    @Override
    public String toString() {
        String separador = "|";
        StringBuilder sb = new StringBuilder();
        //Comprobamos si los datos de la trama a leer son menor que 60 y sino rellenamos hasta 60 con " "
        if (DATOS.length() < 61){
            for (int i = DATOS.length(); i < 60 ; i++)
                DATOS += " ";
        }
                sb.append(separador)
                .append(Pre).append(separador)
                .append(SFD).append(separador)
                .append(DDES).append(separador)
                .append(DORG).append(separador).append("\n")
                .append(String.format("%03d", Long)).append(separador)
                .append(DATOS).append(separador)
                .append(String.format("%03d", num)).append(separador);
        return sb.toString();


    }
}