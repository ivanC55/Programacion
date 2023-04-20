public class Alumno {
    private long id;
    private String nombre,primerApellido,segundoApellido;
    public Alumno(long id,String nombre, String primerApellido, String segundoApellido){
        this.id=id;
        this.nombre=nombre;
        this.primerApellido=primerApellido;
        this.segundoApellido=segundoApellido;
    }
    public Alumno(long id,String nombre,String primerApellido){
        this.id=id;
        this.nombre=nombre;
        this.primerApellido=primerApellido;
    }

    public long getId() { return id;}
    public String getNombre() { return nombre;}
    public String getPrimerApellido() { return primerApellido;}
    public String getSegundoApellido() { return segundoApellido;}

    public String toString(){
        if (null == segundoApellido) { return "Nombre : "+nombre+"\t primer apellido : "+primerApellido;}
        else{ return "Nombre : "+nombre+"\t Primer apellido : "+primerApellido+"\t Segundo apellido : "+segundoApellido;}
    }
}
