// Q4. Unique Departments
import java.util.HashSet;

public class Program4 {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();

        departments.add("Computer Science");
        departments.add("Mechanical");
        departments.add("Electrical");
        departments.add("Computer Science");
        departments.add("Civil");
        departments.add("Mechanical");

        System.out.println("Unique Departments: " + departments);
    }
}
