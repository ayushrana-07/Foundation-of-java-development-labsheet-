import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of subjects for student " + (i + 1) + ": ");
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];

            System.out.println("Enter marks:");
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " marks: ");
            for (int mark : marks[i]) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
