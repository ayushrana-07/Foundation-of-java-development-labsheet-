// Question 28. Accept a number and display the number of digits using expressions and if-else.

import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        number = Math.abs(number);

        if (number < 10) {
            System.out.println("Number of digits = 1");
        } else if (number < 100) {
            System.out.println("Number of digits = 2");
        } else if (number < 1000) {
            System.out.println("Number of digits = 3");
        } else if (number < 10000) {
            System.out.println("Number of digits = 4");
        } else if (number < 100000) {
            System.out.println("Number of digits = 5");
        } else {
            System.out.println("Number has more than 5 digits.");
        }
    }
}
