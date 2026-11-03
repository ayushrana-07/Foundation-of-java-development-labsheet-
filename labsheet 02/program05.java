// Q5. Create a Java program that takes an integer and outputs its negative value using unary operators.

import java.util.Scanner;

class NegativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int negative = -number;

        System.out.println("Negative value = " + negative);

        sc.close();
    }
}
