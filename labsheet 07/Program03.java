// Q3. Print the name and priority of the main thread, change its name and print it again.
class Program03 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println("Thread name: " + mainThread.getName());
        System.out.println("Thread priority: " + mainThread.getPriority());

        mainThread.setName("MyMainThread");
        System.out.println("Updated thread name: " + mainThread.getName());
    }
}
