public class Program12 {
    static class StudentMarks {
        int marks1, marks2, marks3;
        static String universityName = "Doon University";

        StudentMarks(int m1, int m2, int m3) {
            marks1 = m1;
            marks2 = m2;
            marks3 = m3;
        }

        void showAverage() {
            int total = marks1 + marks2 + marks3;
            double average = total / 3.0;
            System.out.println("University: " + universityName);
            System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
        }
    }

    public static void main(String[] args) {
        StudentMarks s = new StudentMarks(78, 85, 91);
        s.showAverage();
    }
}
