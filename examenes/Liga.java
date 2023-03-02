import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * @Author: Ivan Cerros Brioso
 * */
public class Liga {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Equipo> equipos = new ArrayList<>();
        Map<Partido,Equipo> liga = new HashMap();
        for (int i = 0; i < 6; i++) {
            equipos.add(new Equipo(sc.next(),0));
        }
        for (int i = 0; i < equipos.size(); i++) {
            int equipo1 = equipos.get(i);
            int equipo2 = (int)(Math.random()*6+1);
            liga.put(equipo1,equipo2);
        }
        
        
    }
}
