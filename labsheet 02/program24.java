// Q24. Write a Java program to find the maximum and minimum values in an integer array using a for-each loop.

import java.util.Scanner;

class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }

            if (number < minimum) {
                minimum = number;
            }
        }

        System.out.println("Maximum value = " + maximum);
        System.out.println("Minimum value = " + minimum);

        sc.close();
    }
}
