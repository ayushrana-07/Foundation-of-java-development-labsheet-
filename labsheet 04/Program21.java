public class Program21 {
    static class Palindrome {
        static int countChecks = 0;

        boolean isPalindrome(int number) {
            int original = number;
            int reversed = 0;
            int temp = number;
            while (temp > 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp = temp / 10;
            }
            countChecks++;
            return original == reversed;
        }
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        int[] numbers = {121, 345, 9889, 1001, 4567};
        for (int n : numbers) {
            if (p.isPalindrome(n)) {
                System.out.println(n + " is a palindrome");
            } else {
                System.out.println(n + " is not a palindrome");
            }
        }
        System.out.println("Total checks: " + Palindrome.countChecks);
    }
}
