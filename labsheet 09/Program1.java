// Q1. Student List
import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Ayush");
        students.add("Rahul");
        students.add("Aman");
        students.add("Rohit");
        students.add("Priya");
        students.add("Neha");
        students.add("Karan");
        students.add("Simran");
        students.add("Arjun");
        students.add("Anjali");

        System.out.println("Student Names: " + students);
        System.out.println("Total Students: " + students.size());
    }
}
