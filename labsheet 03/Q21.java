import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        if (n > 0) {
            int first = a[0];
            for (int i = 0; i < n - 1; i++) a[i] = a[i + 1];
            a[n - 1] = first;
        }

        System.out.println("After left rotation:");
        for (int value : a) System.out.print(value + " ");
        sc.close();
    }
}
