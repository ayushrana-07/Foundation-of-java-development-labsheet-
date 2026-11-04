// Q5. Copy One File into Another File
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Program5 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("source.txt");
            FileWriter writer = new FileWriter("backup.txt");

            int ch;

            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
