// Question 6. Write a Java program to accept a character and print its ASCII value.

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int asciiValue = (int) ch;

        System.out.println("ASCII value of " + ch + " = " + asciiValue);
    }
}
