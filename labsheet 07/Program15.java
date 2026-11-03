// Q15. Fix Q14 by making both threads acquire Lock1 and Lock2 in the same order so the program completes normally.
class Program15 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread first = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 acquired Lock1");
                synchronized (lock2) {
                    System.out.println("Thread 1 acquired Lock2");
                }
            }
        });

        Thread second = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 2 acquired Lock1");
                synchronized (lock2) {
                    System.out.println("Thread 2 acquired Lock2");
                }
            }
        });

        first.start();
        second.start();
    }
}
