// Question 8. Input a character and check whether it is a vowel or a consonant using if-else.

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U') {

            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is a consonant.");
        }
    }
}
