public class Program26 {
    static class Matrix {
        int[][] data = new int[2][2];
        static String matrixType = "2x2 Square Matrix";

        Matrix(int a, int b, int c, int d) {
            data[0][0] = a;
            data[0][1] = b;
            data[1][0] = c;
            data[1][1] = d;
        }

        Matrix add(Matrix other) {
            int[][] r = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    r[i][j] = data[i][j] + other.data[i][j];
                }
            }
            return new Matrix(r[0][0], r[0][1], r[1][0], r[1][1]);
        }

        Matrix subtract(Matrix other) {
            int[][] r = new int[2][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    r[i][j] = data[i][j] - other.data[i][j];
                }
            }
            return new Matrix(r[0][0], r[0][1], r[1][0], r[1][1]);
        }

        void display() {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(data[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix(1, 2, 3, 4);
        Matrix m2 = new Matrix(5, 6, 7, 8);
        System.out.println("Type: " + Matrix.matrixType);
        System.out.println("Matrix 1:");
        m1.display();
        System.out.println("Matrix 2:");
        m2.display();
        System.out.println("Sum:");
        m1.add(m2).display();
        System.out.println("Difference:");
        m1.subtract(m2).display();
    }
}
