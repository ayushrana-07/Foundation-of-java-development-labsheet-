// Q5. Create Reader, Writer and Logger threads. Each should sleep for a random time from 0 to 500 ms before printing its name and a message.
import java.util.Random;

class Program05 {
    public static void main(String[] args) {
        String[] names = {"Reader", "Writer", "Logger"};
        Random random = new Random();

        for (String name : names) {
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(random.nextInt(501));
                    System.out.println(Thread.currentThread().getName() + " thread is running.");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }, name);

            thread.start();
        }
    }
}
