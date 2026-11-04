import java.util.ArrayList;

public class Program8 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Rahul");
        names.add("Priya");
        names.add("Neha");
        names.add("Rohit");

        System.out.println("Original List : " + names);
        System.out.println("first name : " + names.get(0));

        names.set(1, "Karan");
        System.out.println("After set() " + names);

        names.remove("Priya");
        System.out.println("After remove() " + names);
    }
}
