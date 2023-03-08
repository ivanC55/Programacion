import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        int num;
        TreeSet <Integer> tSet= new TreeSet<>();
        for (int i = 0; i < 11; i++) {
         num=(int)(Math.random()*100+1);
         tSet.add(num);
        }
        tSet.forEach(System.out::println);
    }
}
