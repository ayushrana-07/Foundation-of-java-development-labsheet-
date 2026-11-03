// Q15. Create a Java program to count the number of set bits (1s) in the binary representation
// of a number using bitwise operators.

import java.util.Scanner;

class SetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count += temp & 1;
            temp = temp >>> 1;
        }

        System.out.println("Number of set bits = " + count);

        sc.close();
    }
}
