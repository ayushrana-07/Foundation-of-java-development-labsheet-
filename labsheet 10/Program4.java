// Q4. Append Data to an Existing File
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("students.txt", true);

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            String roll = sc.nextLine();

            System.out.print("Enter Marks: ");
            String marks = sc.nextLine();

            writer.write("Name: " + name + "\n");
            writer.write("Roll Number: " + roll + "\n");
            writer.write("Marks: " + marks + "\n");
            writer.write("------------------\n");
            writer.close();

            System.out.println("Student information appended successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
