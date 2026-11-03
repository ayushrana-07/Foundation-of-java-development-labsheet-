// Q30. Write a Java program that:
// Uses shift operators to check if a number is a power of 4,
// Uses bitwise to toggle the 3rd bit of that number,
// Uses a for loop to print its multiplication table but skips multiples of 6 using continue,
// Stops if it reaches a multiple of 48 using break.

import java.util.Scanner;

class MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int shiftCount = 0;

        while (temp > 1 && (temp & 3) == 0) {
            temp >>= 2;
            shiftCount++;
        }

        boolean isPowerOf4 = temp == 1;

        if (isPowerOf4) {
            System.out.println(number + " is a power of 4.");
        } else {
            System.out.println(number + " is not a power of 4.");
        }

        int toggledNumber = number ^ (1 << 2);

        System.out.println("After toggling the 3rd bit = " + toggledNumber);

        System.out.println("Multiplication table:");

        for (int i = 1; i <= 20; i++) {
            int result = number * i;

            if (result % 6 == 0) {
                continue;
            }

            if (result % 48 == 0) {
                System.out.println(number + " x " + i + " = " + result);
                System.out.println("Multiple of 48 reached. Stopping.");
                break;
            }

            System.out.println(number + " x " + i + " = " + result);
        }

        sc.close();
    }
}
