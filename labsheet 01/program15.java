// Question 15. Accept a 3-digit number and check whether it is an Armstrong number using arithmetic operators and if-else.

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        int original = number;

        int digit1 = number % 10;
        number = number / 10;

        int digit2 = number % 10;
        number = number / 10;

        int digit3 = number % 10;

        int sum = (digit1 * digit1 * digit1)
                + (digit2 * digit2 * digit2)
                + (digit3 * digit3 * digit3);

        if (sum == original) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }
    }
}
