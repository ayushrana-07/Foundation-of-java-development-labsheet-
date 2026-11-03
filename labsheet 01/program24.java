// Question 24. Accept a number and check whether it is a perfect number. A perfect number is a number whose sum of divisors equals the number.

import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == number) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It is not a perfect number.");
        }
    }
}
