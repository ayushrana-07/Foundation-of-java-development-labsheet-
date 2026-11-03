// Q18. Write a Java program to print the first 20 terms of the Fibonacci sequence using a for loop.

class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        System.out.println("First 20 terms of Fibonacci sequence:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
