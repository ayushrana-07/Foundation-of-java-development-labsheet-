// Question 26. Input a five-digit number and check whether the first and last digits are the same using arithmetic expressions.

import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();

        int firstDigit = number / 10000;
        int lastDigit = number % 10;

        if (firstDigit == lastDigit) {
            System.out.println("First and last digits are the same.");
        } else {
            System.out.println("First and last digits are different.");
        }
    }
}
