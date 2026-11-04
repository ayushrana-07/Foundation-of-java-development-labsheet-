// Q14. ArrayList vs LinkedList Lab

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Program14 {
    static final int N = 50000;

    static long insertFront(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.add(0, i);
        }
        return System.nanoTime() - start;
    }

    static long deleteFront(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < N / 2; i++) {
            list.remove(0);
        }
        return System.nanoTime() - start;
    }

    static long getMiddle(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.get(list.size() / 2);
        }
        return System.nanoTime() - start;
    }

    static long sizeCalls(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list.size();
        }
        return System.nanoTime() - start;
    }

    static long iterate(List<Integer> list) {
        long start = System.nanoTime();
        long sum = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            sum += it.next();
        }
        return System.nanoTime() - start;
    }

    static void row(String operation, long a, long l) {
        System.out.printf("%-26s %-16.3f %-16.3f%n", operation, a / 1_000_000.0, l / 1_000_000.0);
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long aInsert = insertFront(arrayList);
        long lInsert = insertFront(linkedList);

        long aGet = getMiddle(arrayList);
        long lGet = getMiddle(linkedList);

        long aSize = sizeCalls(arrayList);
        long lSize = sizeCalls(linkedList);

        long aIter = iterate(arrayList);
        long lIter = iterate(linkedList);

        long aDelete = deleteFront(arrayList);
        long lDelete = deleteFront(linkedList);

        System.out.println("Time taken in milliseconds (" + N + " elements)\n");
        System.out.printf("%-26s %-16s %-16s%n", "Operation", "ArrayList", "LinkedList");
        System.out.println("-----------------------------------------------------------");
        row("Insertion at front", aInsert, lInsert);
        row("Deletion from front", aDelete, lDelete);
        row("get() from middle", aGet, lGet);
        row("size() x 100000", aSize, lSize);
        row("Iteration", aIter, lIter);

        System.out.println("\nObservations:");
        System.out.println("Insertion/deletion at front : LinkedList is faster, ArrayList shifts every element.");
        System.out.println("get(index)                  : ArrayList is faster, LinkedList walks node by node.");
        System.out.println("size()                      : Both are O(1), the difference is negligible.");
        System.out.println("Iteration                   : Both are O(n), ArrayList is usually a bit quicker.");
    }
}
