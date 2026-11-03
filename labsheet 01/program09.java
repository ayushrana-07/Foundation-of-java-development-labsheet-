// Question 9. Input marks of three subjects, calculate total and percentage, and print pass/fail using if-else. Passing criteria: >=40% in all subjects.

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int marks2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int marks3 = sc.nextInt();

        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
