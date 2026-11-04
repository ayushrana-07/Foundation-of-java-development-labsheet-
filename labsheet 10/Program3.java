// Q3. Count Characters, Words and Lines
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Program3 {
    public static void main(String[] args) {
        int lines = 0, words = 0, characters = 0;

        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Java is easy\n");
            writer.write("File handling is important\n");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();

                if (!line.trim().isEmpty()) {
                    words += line.trim().split("\\s+").length;
                }
            }

            reader.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
