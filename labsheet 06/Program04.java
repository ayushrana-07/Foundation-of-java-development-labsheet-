// Q4. Accept two numbers, perform division, create a five-element array, accept an index and display its element. Handle ArithmeticException, ArrayIndexOutOfBoundsException and NumberFormatException using separate catch blocks.
import java.util.Scanner;

class Program04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.nextLine());

            System.out.println("Division result: " + (a / b));

            System.out.print("Enter array index (0-4): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Array element: " + numbers[index]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        }

        sc.close();
    }
}
