import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (a[i][j] == target) {
                    System.out.println("Found at row " + (i + 1)
                            + ", column " + (j + 1));
                    found = true;
                }
            }
        }

        if (!found) System.out.println("Element not found.");
        sc.close();
    }
}
