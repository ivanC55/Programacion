import java.util.List;
/**
 * @Author Ivan Cerros Brioso
 * */
public class Persona {
    private long id;
    private String nombre;
    Persona (long id, String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
