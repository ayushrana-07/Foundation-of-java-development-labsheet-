public class Program23 {
    static class PrimeChecker {
        static int totalPrimeChecks = 0;

        boolean isPrime(int number) {
            totalPrimeChecks++;
            if (number < 2) {
                return false;
            }
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        PrimeChecker pc = new PrimeChecker();
        int[] numbers = {2, 15, 17, 29, 1, 100};
        for (int n : numbers) {
            if (pc.isPrime(n)) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }
        System.out.println("Total prime checks: " + PrimeChecker.totalPrimeChecks);
    }
}
