// Q4. Create two threads that each print their own name and a count from 1 to 5.
class Program04 {
    public static void main(String[] args) {
        Thread first = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }, "Thread-1");

        Thread second = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }, "Thread-2");

        first.start();
        second.start();
    }
}
