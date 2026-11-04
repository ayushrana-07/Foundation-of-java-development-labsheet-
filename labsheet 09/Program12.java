// Q12. Hospital Patient List

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        ArrayList<String> patientNames = new ArrayList<>();
        HashSet<String> patientIds = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add patient name");
            System.out.println("2. Add patient ID");
            System.out.println("3. Remove patient name");
            System.out.println("4. Remove patient ID");
            System.out.println("5. Search patient name");
            System.out.println("6. Search patient ID");
            System.out.println("7. Display records");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine().trim();
                    patientNames.add(name);
                    System.out.println(name + " added.");
                    break;
                case 2:
                    System.out.print("Enter patient ID: ");
                    String id = sc.nextLine().trim();
                    if (patientIds.add(id)) {
                        System.out.println("ID " + id + " added.");
                    } else {
                        System.out.println("ID already exists.");
                    }
                    break;
                case 3:
                    System.out.print("Enter patient name to remove: ");
                    String removeName = sc.nextLine().trim();
                    if (patientNames.remove(removeName)) {
                        System.out.println(removeName + " removed.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter patient ID to remove: ");
                    String removeId = sc.nextLine().trim();
                    if (patientIds.remove(removeId)) {
                        System.out.println("ID " + removeId + " removed.");
                    } else {
                        System.out.println("ID not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter patient name to search: ");
                    String searchName = sc.nextLine().trim();
                    if (patientNames.contains(searchName)) {
                        System.out.println("Found at index " + patientNames.indexOf(searchName));
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter patient ID to search: ");
                    String searchId = sc.nextLine().trim();
                    System.out.println(patientIds.contains(searchId) ? "ID found." : "ID not found.");
                    break;
                case 7:
                    System.out.println("Patient names: " + patientNames);
                    System.out.println("Patient IDs: " + patientIds);
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
