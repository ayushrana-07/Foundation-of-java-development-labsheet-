// Q6. Write a Java program to gradually reduce a number by half using /= until it becomes less than 1, counting the number of steps.

import java.util.Scanner;

class HalfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        int steps = 0;

        while (number >= 1) {
            number /= 2;
            steps++;
        }

        System.out.println("Number of steps = " + steps);
        System.out.println("Final value = " + number);

        sc.close();
    }
}
