// Q7. Collections Utility Methods
import java.util.ArrayList;
import java.util.Collections;

public class Program7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));

        System.out.println("Frequency of 10: " +
                Collections.frequency(numbers, 10));
    }
}
