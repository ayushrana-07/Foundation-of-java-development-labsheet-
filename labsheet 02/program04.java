// Q4. Write a Java program to demonstrate prefix and postfix increment by simulating a counter for visitors entering and leaving a store.

import java.util.Scanner;

class VisitorCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visitors = 0;

        System.out.print("Enter visitors entering the store: ");
        int entering = sc.nextInt();

        visitors += entering;
        System.out.println("Visitors after entering = " + visitors);

        System.out.println("Postfix increment: " + visitors++);
        System.out.println("After postfix increment = " + visitors);

        System.out.println("Prefix increment: " + (++visitors));
        System.out.println("After prefix increment = " + visitors);

        System.out.print("Enter visitors leaving the store: ");
        int leaving = sc.nextInt();

        visitors -= leaving;

        System.out.println("Visitors remaining = " + visitors);

        sc.close();
    }
}
