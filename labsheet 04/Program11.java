public class Program11 {
    static class Calculator {
        static int operationsCount = 0;

        double add(double a, double b) {
            double result = a + b;
            operationsCount++;
            return result;
        }

        double subtract(double a, double b) {
            double result = a - b;
            operationsCount++;
            return result;
        }

        double multiply(double a, double b) {
            double result = a * b;
            operationsCount++;
            return result;
        }

        double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                return 0;
            }
            double result = a / b;
            operationsCount++;
            return result;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(20, 5));
        System.out.println("Subtract: " + calc.subtract(20, 5));
        System.out.println("Multiply: " + calc.multiply(20, 5));
        System.out.println("Divide: " + calc.divide(20, 5));
        System.out.println("Total operations: " + Calculator.operationsCount);
    }
}
