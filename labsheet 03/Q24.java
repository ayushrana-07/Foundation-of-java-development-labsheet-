import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int size = 0;
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < size; j++) {
                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) a[size++] = a[i];
        }

        System.out.println("Array without duplicates:");
        for (int i = 0; i < size; i++) System.out.print(a[i] + " ");
        sc.close();
    }
}
