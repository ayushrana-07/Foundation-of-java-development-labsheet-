public class Q29 {
    public static void main(String[] args) {
        int[][] a = {
            {5, 2, 8},
            {9, 1},
            {7, 3, 6, 4}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                for (int k = 0; k < a[i].length - 1 - j; k++) {
                    if (a[i][k] > a[i][k + 1]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Jagged array with each row sorted:");
        for (int[] row : a) {
            for (int value : row) System.out.print(value + " ");
            System.out.println();
        }
    }
}
