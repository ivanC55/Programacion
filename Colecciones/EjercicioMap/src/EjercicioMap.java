import java.util.HashMap;
import java.util.Map;

public class EjercicioMap {
    public static void main(String[] args) {
        Map<String, Integer> mapaCiudades = new HashMap<>();
        mapaCiudades.put("Badajoz",36);
        mapaCiudades.put("Caceres",34);
        mapaCiudades.put("Sevilla",36);
        mapaCiudades.put("Madrid",32);
        mapaCiudades.put("Barcelona",26);
        System.out.println(mapaCiudades);
        mapaCiudades.put("Barcelona",26);
        System.out.println(mapaCiudades);
        mapaCiudades.remove("Barcelona");
        System.out.println(mapaCiudades);
        mapaCiudades.put("Barcelona",30);
        mapaCiudades.replace("Barcelona",37);
        System.out.println(mapaCiudades);
    }
}
