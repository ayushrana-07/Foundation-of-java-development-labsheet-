// Q6. Search for a Word in a File
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Java is easy. Java is powerful. Learn Java.");
            writer.close();

            System.out.print("Enter word to search: ");
            String search = sc.nextLine();

            BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
            String line;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(search)) {
                        count++;
                    }
                }
            }

            reader.close();

            if (count > 0) {
                System.out.println("Word found.");
                System.out.println("Occurrences: " + count);
            } else {
                System.out.println("Word not found.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
