public class Program25 {
    static class Factorial {
        static int totalCalls = 0;

        long compute(int n) {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            totalCalls++;
            return result;
        }
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        int[] values = {0, 5, 8, 12};
        for (int v : values) {
            System.out.println(v + "! = " + f.compute(v));
        }
        System.out.println("Total calls: " + Factorial.totalCalls);
    }
}
