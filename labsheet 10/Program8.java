// Q8. Count Vowels, Consonants, Digits and Spaces
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Program8 {
    public static void main(String[] args) {
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        try {
            FileWriter writer = new FileWriter("input.txt");
            writer.write("Java Programming 123");
            writer.close();

            FileReader reader = new FileReader("input.txt");
            int ch;

            while ((ch = reader.read()) != -1) {
                char c = (char) ch;

                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowels++;
                } else if (Character.isLetter(c)) {
                    consonants++;
                } else if (Character.isDigit(c)) {
                    digits++;
                } else if (c == ' ') {
                    spaces++;
                }
            }

            reader.close();

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
