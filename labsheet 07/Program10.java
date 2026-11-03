// Q10. Create two threads that each withdraw money 1000 times from the same BankAccount using a non-synchronized withdraw() method to demonstrate a race condition.
class BankAccount {
    private int balance = 20000;

    public void withdraw(int amount) {
        int currentBalance = balance;
        Thread.yield();
        balance = currentBalance - amount;
    }

    public int getBalance() {
        return balance;
    }
}

class Program10 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Thread first = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.withdraw(10);
            }
        });

        Thread second = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.withdraw(10);
            }
        });

        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println("Expected balance: 0");
        System.out.println("Actual balance: " + account.getBalance());
    }
}
