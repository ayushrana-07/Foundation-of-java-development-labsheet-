public class Program20 {
    static class BankAccount {
        double balance;
        static String bankCode = "SBIN0001";

        BankAccount(double b) {
            balance = b;
        }

        void withdraw(double amount) {
            double available = balance;
            if (amount > available) {
                System.out.println("Withdrawal of " + amount + " failed. Available balance: " + available);
            } else {
                double remaining = available - amount;
                balance = remaining;
                System.out.println("Withdrawn: " + amount + ", Remaining balance: " + remaining);
            }
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(8000);
        System.out.println("Bank code: " + BankAccount.bankCode);
        acc.withdraw(3000);
        acc.withdraw(6000);
    }
}
