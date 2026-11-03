import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] a = new int[2][2][2];

        System.out.println("Enter 8 integers:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    System.out.print(a[i][j][k] + "\t");
                System.out.println();
            }
        }
        sc.close();
    }
}
