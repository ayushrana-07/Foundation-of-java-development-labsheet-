// Question 1. Write a Java program to display your name, age, and college name using variables of appropriate data types.

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your college name: ");
        String collegeName = sc.nextLine();

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("College Name: " + collegeName);
    }
}
