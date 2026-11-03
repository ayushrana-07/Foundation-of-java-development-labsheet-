import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int zero = 0, nonZero = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = sc.nextInt();
                if (value == 0) zero++;
                else nonZero++;
            }
        }

        if (zero > nonZero)
            System.out.println("The matrix is sparse.");
        else
            System.out.println("The matrix is not sparse.");
        sc.close();
    }
}
