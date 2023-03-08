import java.util.*;

public class Estadisticas {
    public static void main(String[] args) {
        Iterator<> it = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
        Scanner sc = new Scanner(System.in);
        //6 equipos deben jugar 10 partidos enfrentando a todos dos veces menos a el mismo.
        Set<Equipos> equipos = new HashSet<>();
        ArrayList<Partido> liga = new ArrayList<>();


        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce nombre : ");
            equipos.add(new Equipos(sc.next(),0));
        }
        for (int j = 0; j < 10; j++) {
            int equipoLocal = (int)(Math.random()*6+1);
            int equipoVisitante = (int)(Math.random()*6+1);
            if (equipoLocal == equipoVisitante){
                System.out.println("Mismo equipo.");
            }else if(liga.contains(Partido(equipos.stream().))){

            }
            liga.add(new Partido(equipos.));

        }

        equipos.forEach(System.out::println);
        System.out.println(equipos);
    }
}
