public class Program22 {
    static class Armstrong {
        static int totalChecks = 0;

        boolean isArmstrong(int number) {
            int temp = number;
            int digits = String.valueOf(number).length();
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            totalChecks++;
            return sum == number;
        }
    }

    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        int[] numbers = {153, 370, 123, 9474, 100};
        for (int n : numbers) {
            if (a.isArmstrong(n)) {
                System.out.println(n + " is an Armstrong number");
            } else {
                System.out.println(n + " is not an Armstrong number");
            }
        }
        System.out.println("Total checks: " + Armstrong.totalChecks);
    }
}
