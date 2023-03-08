public class Persona {
    private String nombre;
    private int id;
    private int edad;
    public Persona(){}
    public Persona(int id,String nombre, int edad){
        this.id=id;
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return " -----------------------\n" +
                " Nombre= '" + nombre + '\'' +
                "\n Id= " + id +
                "\n Edad= " + edad;
    }
}
