// Q17. Create a Java program to cyclically rotate the bits of an integer to the left by 2 positions.

import java.util.Scanner;

class RotateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int rotated = (number << 2) | (number >>> 30);

        System.out.println("After cyclic left rotation by 2 bits = " + rotated);

        sc.close();
    }
}
