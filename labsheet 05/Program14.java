public class Program14 {
    static class Employee {
        protected double basicSalary;

        Employee(double basicSalary) { this.basicSalary = basicSalary; }

        double calculateSalary() {
            double hra = basicSalary * 0.10;
            return basicSalary + hra;
        }
    }

    static class Manager extends Employee {
        Manager(double basicSalary) { super(basicSalary); }

        @Override
        double calculateSalary() {
            double hra = basicSalary * 0.20;
            double bonus = basicSalary * 0.15;
            return basicSalary + hra + bonus;
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee(40000);
        Employee m = new Manager(40000);
        System.out.println("Employee salary (Employee version): " + e.calculateSalary());
        System.out.println("Manager salary (Manager version): " + m.calculateSalary());
    }
}
