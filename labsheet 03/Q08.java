import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int sum = 0;

        System.out.println("Enter 9 matrix elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
        }

        System.out.println("Sum of all elements = " + sum);
        sc.close();
    }
}
