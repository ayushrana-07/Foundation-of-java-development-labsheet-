// Q12. Accept a patient's name and age. Validate that age is between 0 and 120 using InvalidPatientAgeException and handle non-numeric age input.
import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String message) {
        super(message);
    }
}

class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException("Age must be between 0 and 120.");
            }

            System.out.println("Patient registered successfully.");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Please enter age as a number.");
        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
