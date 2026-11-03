// Q14. Create a deadlock using Lock1 and Lock2, where two threads acquire the locks in opposite order. Stop the program manually after observing the deadlock.
class Program14 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread first = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 acquired Lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                synchronized (lock2) {
                    System.out.println("Thread 1 acquired Lock2");
                }
            }
        });

        Thread second = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 acquired Lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                synchronized (lock1) {
                    System.out.println("Thread 2 acquired Lock1");
                }
            }
        });

        first.start();
        second.start();
    }
}
