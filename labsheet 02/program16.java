// Q16. Write a Java program to perform fast multiplication and division of a number by powers
// of two using shift operators.

import java.util.Scanner;

class ShiftOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter power of 2: ");
        int power = sc.nextInt();

        int multiplied = number << power;
        int divided = number >> power;

        System.out.println("After multiplication by 2^" + power + " = " + multiplied);
        System.out.println("After division by 2^" + power + " = " + divided);

        sc.close();
    }
}
