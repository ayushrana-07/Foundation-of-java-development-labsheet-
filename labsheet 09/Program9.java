// Q9. ListIterator Modification
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program9 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Rohit");

        ListIterator<String> itr = students.listIterator();

        while (itr.hasNext()) {
            String name = itr.next();

            if (name.equals("Aman")) {
                itr.set("Ayush");
                itr.add("Priya");
            }
        }

        System.out.println("Modified List: " + students);
    }
}
