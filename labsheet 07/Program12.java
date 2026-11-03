// Q12. Rewrite Q11 using a synchronized block with a dedicated lock object around the balance update.
class BankAccount {
    private int balance = 20000;
    private final Object lock = new Object();

    public void withdraw(int amount) {
        synchronized (lock) {
            balance -= amount;
        }
    }

    public int getBalance() {
        synchronized (lock) {
            return balance;
        }
    }
}

class Program12 {
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

        System.out.println("Final balance: " + account.getBalance());
    }
}
