// Q2. Marks List
import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(92);
        marks.add(88);

        System.out.println("First Mark: " + marks.get(0));
        System.out.println("Last Mark: " + marks.get(4));
        System.out.println("Middle Mark: " + marks.get(2));
    }
}
