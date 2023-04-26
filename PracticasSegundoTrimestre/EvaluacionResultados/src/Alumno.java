import java.util.HashMap;

public class Alumno {

    protected static final String[] MODULOS = {"Prog", "Bd", "Lm", "Fol", "Ent", "Sis"};
    private String nombre;
    private HashMap<String, Float> notas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        notas = new HashMap<String, Float>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNota(String modulo, Float nota) {
        notas.put(modulo, nota);
    }

    public Float getNota(String modulo) {
        return notas.getOrDefault(modulo, -1.0f);
    }
    public Float calcularMedia() {
        Float suma = 0f;
        int numModulos = 0;
        for (Float nota : notas.values()) {
            if (nota != -1.0) {
                suma += nota;
                numModulos++;
            }
        }
        if (numModulos == 0) {
            return 0f;
        }
        return suma / numModulos;
    }
    public void imprimirEvaluacion() {
        for (String modulo : MODULOS) {
            Float nota = notas.getOrDefault(modulo, -1.0f);
            if (nota == -1.0) {
                System.out.print(" \t");
            } else {
                System.out.print(nota + "\t");
            }
        }
        System.out.print("|| " + calcularMedia());
    }
}