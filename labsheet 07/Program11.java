// Q11. Fix Q10 by making withdraw() synchronized and confirm that the final balance is correct.
class BankAccount {
    private int balance = 20000;

    public synchronized void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}

class Program11 {
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
