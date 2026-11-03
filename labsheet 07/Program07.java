// Q7. Create a thread that sums numbers from 1 to 10,000. Use join() so main prints "Task finished" only after the calculation completes.
class Program07 extends Thread {
    private long sum;

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) throws InterruptedException {
        Program07 task = new Program07();
        task.start();
        task.join();

        System.out.println("Task finished");
    }
}
