// Q2. Rewrite Q1 using the Runnable interface instead of extending Thread.
class Program02 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ayush");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Program02());
        thread.start();
    }
}
