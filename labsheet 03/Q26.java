import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        System.out.println("Enter " + (n * n) + " elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Upper triangular matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((j >= i ? a[i][j] : 0) + "\t");
            System.out.println();
        }

        System.out.println("Lower triangular matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((j <= i ? a[i][j] : 0) + "\t");
            System.out.println();
        }
        sc.close();
    }
}
