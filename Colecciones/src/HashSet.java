import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> setPrueba= new java.util.HashSet<Integer>();
        setPrueba.add(1);
        setPrueba.add(2);
        setPrueba.add(2);
        setPrueba.add(2);
        setPrueba.add(2);
        setPrueba.forEach(System.out::println);
        }
    }

