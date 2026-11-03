// Q13. Create a Java program to check if a character is a vowel, consonant, digit, or special
// symbol using the ternary operator.

import java.util.Scanner;

class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        String result;

        result = (ch >= '0' && ch <= '9') ? "Digit"
                : ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                ? ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                ? "Vowel" : "Consonant")
                : "Special Symbol";

        System.out.println("Character is a " + result + ".");

        sc.close();
    }
}
