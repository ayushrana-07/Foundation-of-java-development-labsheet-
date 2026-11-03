// Q15. Create a pharmacy inventory system. Reject negative quantities using InvalidQuantityException and insufficient stock using InsufficientMedicineStockException. Handle invalid input with multiple catch blocks and use finally.
import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String message) {
        super(message);
    }
}

class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter medicine name: ");
            String medicine = sc.nextLine();

            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException("Quantity cannot be negative.");
            }
            if (required > available) {
                throw new InsufficientMedicineStockException("Required quantity is greater than available stock.");
            }

            System.out.println("Medicine issued successfully.");
            System.out.println("Medicine: " + medicine);
            System.out.println("Remaining quantity: " + (available - required));
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric quantities.");
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Inventory transaction completed.");
        }

        sc.close();
    }
}
