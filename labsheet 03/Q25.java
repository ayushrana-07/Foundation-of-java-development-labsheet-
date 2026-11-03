import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int mainSum = 0, secondarySum = 0;

        System.out.println("Enter " + (n * n) + " elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            mainSum += a[i][i];
            secondarySum += a[i][n - 1 - i];
        }

        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
        sc.close();
    }
}
