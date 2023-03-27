import java.io.Serializable;

public class Alumno implements Serializable {
    private int edad;
    private String nombre;
    private String curso;
    public Alumno(int edad,String nombre,String curso){
        this.edad=edad;
        this.nombre=nombre;
        this.curso=curso;
    }

    @Override
    public String toString() {
        return "Alumno : " +
                "\n edad : " + edad + "\n nombre : " + nombre + '\n' + " curso : " + curso + '\n';
    }
}
