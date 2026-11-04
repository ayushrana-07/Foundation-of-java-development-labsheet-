// Q6. ArrayList Searching
import java.util.ArrayList;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("HTML");
        courses.add("JavaScript");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        if (courses.contains(course)) {
            System.out.println("Course Found!");
        } else {
            System.out.println("Course Not Found!");
        }

        sc.close();
    }
}
