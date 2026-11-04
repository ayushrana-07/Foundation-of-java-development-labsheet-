// Q10. File-Based Employee Management
import java.io.*;
import java.util.Scanner;

class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            File file = new File("employees.txt");
            FileWriter writer = new FileWriter(file);

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            String salary = sc.nextLine();

            writer.write(id + "," + name + "," + department + "," + salary + "\n");
            writer.close();

            System.out.print("\nEnter Employee ID to search: ");
            String searchId = sc.nextLine();

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                if (data[0].equals(searchId)) {
                    System.out.println("Employee Record Found:");
                    System.out.println("Employee ID: " + data[0]);
                    System.out.println("Employee Name: " + data[1]);
                    System.out.println("Department: " + data[2]);
                    System.out.println("Salary: " + data[3]);

                    found = true;
                    break;
                }
            }

            reader.close();

            if (!found) {
                System.out.println("Employee record not found.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
