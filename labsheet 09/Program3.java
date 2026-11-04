// Q3. Update Student Name
import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Aman");
        students.add("Rohit");
        students.add("Priya");
        students.add("Neha");

        students.set(1, "Ayush");
        students.remove(3);

        System.out.println("Updated Student List: " + students);
    }
}
