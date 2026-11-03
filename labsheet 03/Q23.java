import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        if (n < 2) {
            System.out.println("Second largest element does not exist.");
            sc.close();
            return;
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int value : a) {
            if (value > largest) {
                second = largest;
                largest = value;
            } else if (value > second && value < largest) {
                second = value;
            }
        }

        if (second == Integer.MIN_VALUE) {
            boolean exists = false;
            for (int value : a) if (value != largest) exists = true;
            System.out.println(exists ? "Second largest element = " + second
                                     : "Second largest distinct element does not exist.");
        } else {
            System.out.println("Second largest element = " + second);
        }
        sc.close();
    }
}
