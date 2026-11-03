// Q3. Convert a number stored as a String into an integer using Integer.parseInt(). Handle NumberFormatException.
import java.util.Scanner;

class Program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String value = sc.nextLine();

        try {
            int number = Integer.parseInt(value);
            System.out.println("Integer value: " + number);
        } catch (NumberFormatException e) {
            System.out.println("The entered value is not a valid integer.");
        }

        sc.close();
    }
}
