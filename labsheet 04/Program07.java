public class Program07 {
    static class BankAccount {
        long accountNumber;
        double balance;
        static String bankName = "State Bank of India";

        BankAccount(long acc, double bal) {
            accountNumber = acc;
            balance = bal;
        }

        void deposit(double amount) {
            double oldBalance = balance;
            double newBalance = oldBalance + amount;
            balance = newBalance;
            System.out.println("Deposited: " + amount);
            System.out.println("Previous balance: " + oldBalance);
            System.out.println("Current balance: " + newBalance);
        }

        void display() {
            System.out.println("Bank: " + bankName);
            System.out.println("Account No: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1234567890L, 5000);
        acc.display();
        acc.deposit(2500);
    }
}
