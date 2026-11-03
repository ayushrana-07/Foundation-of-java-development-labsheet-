// Q9. Create five threads, assign different priorities from 1 to 10, start them and observe their execution order.
class Program09 {
    public static void main(String[] args) {
        int[] priorities = {1, 3, 5, 7, 10};

        for (int i = 0; i < priorities.length; i++) {
            final int number = i + 1;
            Thread thread = new Thread(() -> {
                for (int j = 1; j <= 3; j++) {
                    System.out.println(Thread.currentThread().getName() + " - " + j);
                }
            }, "Thread-" + number);

            thread.setPriority(priorities[i]);
            System.out.println(thread.getName() + " priority: " + thread.getPriority());
            thread.start();
        }
    }
}
