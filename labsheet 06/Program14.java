// Q14. Accept exam marks, validate the range 0-100 using InvalidExamMarksException, display PASS for 40 or above and FAIL otherwise, handle invalid input and use finally.
import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String message) {
        super(message);
    }
}

class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student's marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException("Marks must be between 0 and 100.");
            }

            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric marks.");
        } catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exam evaluation completed.");
        }

        sc.close();
    }
}
