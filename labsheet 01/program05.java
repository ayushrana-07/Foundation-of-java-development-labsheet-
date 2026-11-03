// Question 5. Accept a floating-point number and convert it explicitly to an integer. Print both the original and the converted values.

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = sc.nextDouble();

        int convertedNumber = (int) number;

        System.out.println("Original value = " + number);
        System.out.println("Converted integer value = " + convertedNumber);
    }
}
