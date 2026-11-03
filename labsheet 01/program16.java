// Question 16. Input salary and calculate tax based on income slabs using if-else.
// Income <= 250000: No tax
// 250001 to 500000: 5%
// 500001 to 1000000: 20%
// Above 1000000: 30%

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = income * 0.05;
        } else if (income <= 1000000) {
            tax = income * 0.20;
        } else {
            tax = income * 0.30;
        }

        System.out.println("Annual Income = Rs. " + income);
        System.out.println("Tax = Rs. " + tax);
    }
}
