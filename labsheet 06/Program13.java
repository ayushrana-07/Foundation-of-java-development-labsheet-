// Q13. Accept patient name, drug name and dosage in mg. Validate dosage from 1 to 1000 using InvalidDosageException and display a completion message in finally.
import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String message) {
        super(message);
    }
}

class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String patient = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drug = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            double dosage = Double.parseDouble(sc.nextLine());

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException("Dosage must be greater than 0 and at most 1000 mg.");
            }

            System.out.println("Dosage is valid.");
            System.out.println("Patient: " + patient);
            System.out.println("Drug: " + drug);
            System.out.println("Dosage: " + dosage + " mg");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid numeric dosage.");
        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Dosage validation completed.");
        }

        sc.close();
    }
}
