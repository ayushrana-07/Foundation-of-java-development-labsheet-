// Q20. Write a Java program to repeatedly accept a password until the correct one is entered (use do-while).

import java.util.Scanner;

class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "Java123";
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.");
            }

        } while (!password.equals(correctPassword));

        System.out.println("Correct password. Access granted.");

        sc.close();
    }
}
