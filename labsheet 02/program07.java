// Q7. Create a Java program to accumulate rainfall data for 7 days using += and find the total.

import java.util.Scanner;

class Rainfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall for day " + day + ": ");
            double rainfall = sc.nextDouble();

            total += rainfall;
        }

        System.out.println("Total rainfall for 7 days = " + total);

        sc.close();
    }
}
