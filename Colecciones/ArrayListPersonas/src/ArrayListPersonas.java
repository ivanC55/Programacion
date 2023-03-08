import java.util.ArrayList;
import java.util.List;

public class ArrayListPersonas {
    public static void main(String[] args) {
        List<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(new Persona(1,"Ana",20));
        listaPersona.add(new Persona(2,"Sara",23));
        listaPersona.add(new Persona(3,"Tom",22));
        for (int i = 0; i < listaPersona.size(); i++) {
            //recorrido por indice
            System.out.println("Nombre : "+listaPersona.get(i).getNombre());
        }
        //Recorrido con foreach
        for (Persona p:listaPersona) {
            System.out.println("Nombre : "+p.getNombre());
        }
        listaPersona.forEach(listar -> System.out.println(listar.getNombre()+" "));
        listaPersona.forEach(System.out::println);

    }
}
