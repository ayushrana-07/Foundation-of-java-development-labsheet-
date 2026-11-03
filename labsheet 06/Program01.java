// Q1. Write a Java program that accepts two integers and divides the first number by the second number. Handle division by zero using try-catch.
import java.util.Scanner;

class Program01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        sc.close();
    }
}
