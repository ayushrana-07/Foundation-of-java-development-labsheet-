public class Program02 {
    static class BankAccount {
        private long accountNumber;
        private String accountHolder;
        private double balance;

        public BankAccount(long accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public long getAccountNumber() { return accountNumber; }
        public void setAccountNumber(long accountNumber) { this.accountNumber = accountNumber; }
        public String getAccountHolder() { return accountHolder; }
        public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }
        public double getBalance() { return balance; }
        public void setBalance(double balance) { this.balance = balance; }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid deposit. Amount must be greater than 0.");
                return;
            }
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal. Amount must be greater than 0.");
            } else if (amount > balance) {
                System.out.println("Insufficient balance. Cannot withdraw " + amount + ". Current balance: " + balance);
            } else {
                balance -= amount;
                System.out.println("Withdrawn " + amount + ". New balance: " + balance);
            }
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1002003004L, "Riya Verma", 5000);
        System.out.println("Holder: " + acc.getAccountHolder() + ", Account: " + acc.getAccountNumber());
        System.out.println("Opening balance: " + acc.getBalance());
        acc.deposit(1500);
        acc.deposit(-200);
        acc.withdraw(2000);
        acc.withdraw(10000);
        acc.withdraw(0);
        System.out.println("Final balance: " + acc.getBalance());
    }
}
