import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Jugadores {
    public static void main(String[] args) {
        ArrayList<String> athletic = new ArrayList<>();
        athletic.add("Muni");
        athletic.add("Yeray");
        athletic.add("Sancet");
        athletic.add("Ander");
        athletic.add("De Marcos");
        athletic.forEach(System.out::println);
        //Comprobar si esta 'Neymar'
        if (!athletic.contains("Neymar")) {
            System.out.println("No esta");
        } else {
            System.out.println("Esta");
        }
        HashSet<String> jugadores = new HashSet<>();
        jugadores.add("Muni");
        jugadores.add("De Marcos");
    }

}

