// Q8. Create one thread with MAX_PRIORITY and another with MIN_PRIORITY. Print their priorities before starting them.
class Program08 {
    public static void main(String[] args) {
        Thread high = new Thread(() -> System.out.println("High priority thread is running."));
        Thread low = new Thread(() -> System.out.println("Low priority thread is running."));

        high.setName("HighPriority");
        low.setName("LowPriority");

        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);

        System.out.println(high.getName() + " priority: " + high.getPriority());
        System.out.println(low.getName() + " priority: " + low.getPriority());

        high.start();
        low.start();
    }
}
