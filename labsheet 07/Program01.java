// Q1. Create a thread by extending the Thread class and print your name 5 times with a 200 ms delay between each print.
class Program01 extends Thread {
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
        new Program01().start();
    }
}
