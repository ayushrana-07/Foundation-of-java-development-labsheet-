public class Program17 {
    static class StudentGrade {
        String name;
        int marks;
        static int passingMarks = 40;

        StudentGrade(String n, int m) {
            name = n;
            marks = m;
        }

        void showGrade() {
            char grade;
            if (marks < passingMarks) {
                grade = 'F';
            } else if (marks >= 90) {
                grade = 'A';
            } else if (marks >= 75) {
                grade = 'B';
            } else if (marks >= 60) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            String status = marks >= passingMarks ? "Pass" : "Fail";
            System.out.println(name + " scored " + marks + " -> Grade " + grade + " (" + status + ")");
        }
    }

    public static void main(String[] args) {
        new StudentGrade("Aman", 92).showGrade();
        new StudentGrade("Sneha", 68).showGrade();
        new StudentGrade("Rohit", 35).showGrade();
    }
}
