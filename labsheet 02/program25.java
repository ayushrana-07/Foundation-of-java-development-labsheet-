// Q25. Create a Java program to calculate the average marks of students stored in a 2D array
// using a for-each loop.

import java.util.Scanner;

class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] marks = new int[students][subjects];

        System.out.println("Enter marks:");

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ":");

            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        int total = 0;
        int count = 0;

        for (int[] student : marks) {
            for (int mark : student) {
                total += mark;
                count++;
            }
        }

        double average = (double) total / count;

        System.out.println("Average marks = " + average);

        sc.close();
    }
}
