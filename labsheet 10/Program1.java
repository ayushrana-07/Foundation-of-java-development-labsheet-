// Q1. Create and Write to a File
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Program1 {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            file.createNewFile();

            FileWriter writer = new FileWriter(file);
            writer.write("Student Name: Ayush\n");
            writer.write("Roll Number: 101\n");
            writer.write("Course: BCA\n");
            writer.write("Semester: 3rd\n");
            writer.close();

            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
