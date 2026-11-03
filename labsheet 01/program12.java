// Question 12. Accept a year and check whether it is a leap year using if-else.

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("It is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println("It is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }
    }
}
