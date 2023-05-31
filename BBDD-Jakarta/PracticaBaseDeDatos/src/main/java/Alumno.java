/**
 *
 * @Author: Iván Cerros Brioso
 *
 * */
public class Alumno {
    private String nombre,email,dni,fechaNacimiento;
    public Alumno(String nombre, String email , String dni, String fechaNacimiento){
        this.nombre=nombre;
        this.email=email;
        this.dni=dni;
        this.fechaNacimiento=fechaNacimiento;
    }
    public Alumno (String nombre, String email){
        this.nombre=nombre;
        this.email=email;
        this.dni=null;
        this.fechaNacimiento=null;
    }
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getDni() {
        return dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}