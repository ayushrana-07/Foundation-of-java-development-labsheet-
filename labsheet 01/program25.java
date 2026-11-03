// Question 25. Accept two integers and a logical operator as a character. Use if-else to perform the logical operation and display the result.

import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (& or |): ");
        char operator = sc.next().charAt(0);

        boolean result;

        if (operator == '&') {
            result = (a != 0) && (b != 0);
            System.out.println("Logical AND result = " + result);
        } else if (operator == '|') {
            result = (a != 0) || (b != 0);
            System.out.println("Logical OR result = " + result);
        } else {
            System.out.println("Invalid logical operator.");
        }
    }
}
