// Q8. Use a nested try-catch: the inner try performs array access and the outer try performs division. Handle both exceptions.
import java.util.Scanner;

class Program08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            System.out.println("Division result: " + (a / b));

            try {
                System.out.print("Enter array index (0-4): ");
                int index = sc.nextInt();
                System.out.println("Array element: " + numbers[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        sc.close();
    }
}
