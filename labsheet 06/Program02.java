// Q2. Create an integer array of 5 elements, accept an index and display its element. Handle an invalid index.
import java.util.Scanner;

class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter array index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Element: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }

        sc.close();
    }
}
