// Q8. LinkedList Student Queue
import java.util.LinkedList;

public class Program8 {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addFirst("Rahul");
        students.addLast("Aman");
        students.addLast("Rohit");
        students.addFirst("Ayush");

        System.out.println("Student Queue: " + students);

        students.removeFirst();
        students.removeLast();

        System.out.println("After Removal: " + students);
    }
}
