// Q26. Write a Java program that takes a day number (1–7) and displays whether it’s a weekday
// or weekend using switch-case.

import java.util.Scanner;

class DayType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;

            case 6, 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid day number.");
        }

        sc.close();
    }
}
