import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] copy = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            copy[i] = a[i];
        }

        System.out.println("Copied array:");
        for (int value : copy) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}
