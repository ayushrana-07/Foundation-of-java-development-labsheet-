public class Program15 {
    static class SimpleInterest {
        double principal;
        double rate;
        double time;
        static String bank = "HDFC Bank";

        SimpleInterest(double p, double r, double t) {
            principal = p;
            rate = r;
            time = t;
        }

        void calculate() {
            double interest = (principal * rate * time) / 100;
            double totalAmount = principal + interest;
            System.out.println("Bank: " + bank);
            System.out.println("Principal: " + principal);
            System.out.println("Rate: " + rate + "%");
            System.out.println("Time: " + time + " years");
            System.out.println("Interest: " + interest);
            System.out.println("Total Amount: " + totalAmount);
        }
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest(10000, 7.5, 3);
        si.calculate();
    }
}
