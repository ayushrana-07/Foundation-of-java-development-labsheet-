// Q2. Read Data from a File
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Program2 {
    public static void main(String[] args) {
        File file = new File("student.txt");

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
