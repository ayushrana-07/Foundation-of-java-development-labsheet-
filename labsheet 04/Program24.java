public class Program24 {
    static class Fibonacci {
        static int seriesCount = 0;

        void display(int n) {
            int first = 0;
            int second = 1;
            System.out.print("First " + n + " terms: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
            seriesCount++;
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.display(10);
        f.display(5);
        f.display(15);
        System.out.println("Series generated: " + Fibonacci.seriesCount);
    }
}
