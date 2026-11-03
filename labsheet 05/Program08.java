public class Program08 {
    static class Person {
        String name;

        Person(String name) { this.name = name; }

        void displayName() { System.out.println("Name: " + name); }
    }

    static class Employee extends Person {
        int employeeId;

        Employee(String name, int employeeId) {
            super(name);
            this.employeeId = employeeId;
        }

        void displayEmployee() {
            displayName();
            System.out.println("Employee ID: " + employeeId);
        }
    }

    static class Manager extends Employee {
        String department;

        Manager(String name, int employeeId, String department) {
            super(name, employeeId);
            this.department = department;
        }

        void displayManager() {
            displayEmployee();
            System.out.println("Department: " + department);
        }
    }

    public static void main(String[] args) {
        Manager m = new Manager("Pooja Bisht", 7001, "Finance");
        m.displayManager();
        System.out.println();
        System.out.println("Person   -> name, displayName()");
        System.out.println("Employee -> employeeId, displayEmployee()");
        System.out.println("Manager  -> department, displayManager()");
    }
}
