// Q13. ListIterator Report

import java.util.ArrayList;
import java.util.ListIterator;

public class Program13 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("DBMS");
        courses.add("Operating Systems");
        courses.add("Computer Networks");

        ListIterator<String> it = courses.listIterator();

        System.out.println("Forward traversal:");
        while (it.hasNext()) {
            System.out.println("nextIndex = " + it.nextIndex() + ", element = " + it.next());
        }

        System.out.println("\nBackward traversal:");
        while (it.hasPrevious()) {
            System.out.println("previousIndex = " + it.previousIndex() + ", element = " + it.previous());
        }

        System.out.println("\nAfter moving back to the start:");
        System.out.println("nextIndex() = " + it.nextIndex());
        System.out.println("previousIndex() = " + it.previousIndex());
    }
}
