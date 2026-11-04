// Q11. Sorted Student IDs

import java.util.TreeSet;

public class Program11 {
    public static void main(String[] args) {
        TreeSet<Integer> studentIds = new TreeSet<>();

        studentIds.add(105);
        studentIds.add(101);
        studentIds.add(110);
        studentIds.add(103);
        studentIds.add(101);
        studentIds.add(107);
        studentIds.add(105);
        studentIds.add(102);

        System.out.println("Unique sorted IDs: " + studentIds);
        System.out.println("First ID: " + studentIds.first());
        System.out.println("Last ID: " + studentIds.last());
        System.out.println("Higher than 105: " + studentIds.higher(105));
        System.out.println("Lower than 105: " + studentIds.lower(105));
    }
}
