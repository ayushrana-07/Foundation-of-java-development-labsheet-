// Q10. List vs Set Experiment
import java.util.ArrayList;
import java.util.HashSet;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int[] values = {10, 20, 30, 20, 40, 10, 50};

        for (int value : values) {
            list.add(value);
            set.add(value);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);

        System.out.println("ArrayList allows duplicates.");
        System.out.println("HashSet does not allow duplicates.");
        System.out.println("ArrayList maintains insertion order.");
        System.out.println("HashSet does not guarantee insertion order.");
    }
}
