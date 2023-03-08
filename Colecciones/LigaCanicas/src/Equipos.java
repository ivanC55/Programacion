public class Equipos {
    private String nombre;
    private int puntuacion;
    Equipos(String nombre, int puntuacion){
        this.nombre=nombre;
        this.puntuacion=puntuacion;
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "nombre='" + nombre + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
