// Q21. Create a Java program to display all factors of a number using a do-while loop.

import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int i = 1;

        System.out.println("Factors of " + number + ":");

        do {
            if (number % i == 0) {
                System.out.print(i + " ");
            }

            i++;
        } while (i <= number);

        sc.close();
    }
}
