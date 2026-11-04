// Q15. Mini Student Collection Management System

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Program15 {

    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name;
        }
    }

    static ArrayList<Student> students = new ArrayList<>();
    static HashSet<Integer> idSet = new HashSet<>();
    static TreeSet<Integer> sortedIds = new TreeSet<>();
    static Scanner sc = new Scanner(System.in);

    static int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    static void addStudent() {
        int id = readInt("Enter student ID: ");
        if (idSet.contains(id)) {
            System.out.println("A student with this ID already exists.");
            return;
        }
        System.out.print("Enter student name: ");
        String name = sc.nextLine().trim();
        students.add(new Student(id, name));
        idSet.add(id);
        sortedIds.add(id);
        System.out.println("Student added.");
    }

    static void removeStudent() {
        int id = readInt("Enter student ID to remove: ");
        if (!idSet.contains(id)) {
            System.out.println("Student not found.");
            return;
        }
        ListIterator<Student> it = students.listIterator();
        while (it.hasNext()) {
            if (it.next().id == id) {
                it.remove();
                break;
            }
        }
        idSet.remove(id);
        sortedIds.remove(id);
        System.out.println("Student removed.");
    }

    static void searchStudent() {
        int id = readInt("Enter student ID to search: ");
        if (!idSet.contains(id)) {
            System.out.println("Student not found.");
            return;
        }
        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Found -> " + s);
                return;
            }
        }
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    static void iterateStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        ListIterator<Student> it = students.listIterator();
        System.out.println("Forward:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Backward:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }

    static void showDifference() {
        System.out.println("List (ArrayList)    : " + students.size() + " records, insertion order kept");
        displayStudents();
        System.out.println("Set (HashSet)       : " + idSet + "  -> unique IDs, no guaranteed order");
        System.out.println("SortedSet (TreeSet) : " + sortedIds + "  -> unique IDs, ascending order");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Collection Management ---");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Display students");
            System.out.println("5. Count students");
            System.out.println("6. Iterate forward/backward");
            System.out.println("7. Show unique IDs (HashSet)");
            System.out.println("8. Show sorted IDs (TreeSet)");
            System.out.println("9. List vs Set vs SortedSet");
            System.out.println("0. Exit");
            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1: addStudent(); break;
                case 2: removeStudent(); break;
                case 3: searchStudent(); break;
                case 4: displayStudents(); break;
                case 5: System.out.println("Total students: " + students.size()); break;
                case 6: iterateStudents(); break;
                case 7: System.out.println("Unique IDs: " + idSet); break;
                case 8: System.out.println("Sorted IDs: " + sortedIds); break;
                case 9: showDifference(); break;
                case 0: System.out.println("Exiting."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
