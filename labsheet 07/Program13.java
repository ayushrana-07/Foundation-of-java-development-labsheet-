// Q13. Implement producer-consumer using wait() and notify(). The producer adds numbers 1 to 10 to a single-slot buffer and the consumer reads and prints them.
class SingleSlotBuffer {
    private int value;
    private boolean available = false;

    public synchronized void produce(int number) throws InterruptedException {
        while (available) {
            wait();
        }

        value = number;
        available = true;
        System.out.println("Produced: " + number);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (!available) {
            wait();
        }

        int number = value;
        available = false;
        notify();
        return number;
    }
}

class Program13 {
    public static void main(String[] args) {
        SingleSlotBuffer buffer = new SingleSlotBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    buffer.produce(i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Consumed: " + buffer.consume());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
