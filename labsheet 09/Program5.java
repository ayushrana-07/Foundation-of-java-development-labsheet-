// Q5. Sorted Roll Numbers
import java.util.TreeSet;

public class Program5 {
    public static void main(String[] args) {
        TreeSet<Integer> rolls = new TreeSet<>();

        rolls.add(45);
        rolls.add(12);
        rolls.add(89);
        rolls.add(23);
        rolls.add(67);
        rolls.add(34);
        rolls.add(10);
        rolls.add(56);
        rolls.add(78);
        rolls.add(91);

        System.out.println("Sorted Roll Numbers: " + rolls);
    }
}
