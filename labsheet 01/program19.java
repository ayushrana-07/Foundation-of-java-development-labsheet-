// Question 19. Accept a character and use if-else to identify whether it is a valid operator (+, -, *, /) and perform the corresponding operation on two input numbers.

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result = " + (a + b));
        } else if (operator == '-') {
            System.out.println("Result = " + (a - b));
        } else if (operator == '*') {
            System.out.println("Result = " + (a * b));
        } else if (operator == '/') {
            if (b != 0) {
                System.out.println("Result = " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator.");
        }
    }
}
