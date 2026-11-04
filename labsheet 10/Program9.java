// Q9. Student Record File
import java.io.*;
import java.util.Scanner;

class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("student_records.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details of Student " + i);

                System.out.print("Roll Number: ");
                String roll = sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Course: ");
                String course = sc.nextLine();

                System.out.print("Marks: ");
                String marks = sc.nextLine();

                writer.write(roll + "," + name + "," + course + "," + marks + "\n");
            }

            writer.close();

            System.out.println("\nStudent Records:");

            BufferedReader reader = new BufferedReader(new FileReader("student_records.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
