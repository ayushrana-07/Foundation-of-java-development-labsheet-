// Q6. Demonstrate isAlive() before a thread starts, while it runs and after it finishes.
class Program06 extends Thread {
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Thread is running.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Program06 thread = new Program06();

        System.out.println("Before start: " + thread.isAlive());
        thread.start();
        System.out.println("While running: " + thread.isAlive());

        thread.join();
        System.out.println("After completion: " + thread.isAlive());
    }
}
