// Question 10. Write a Java program to find the greatest of two numbers using if-else.

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is the greatest number.");
        } else if (b > a) {
            System.out.println(b + " is the greatest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
