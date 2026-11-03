public class Program12 {
    static class Employee {
        String employeeName;
        int employeeId;

        Employee(String employeeName, int employeeId) {
            this.employeeName = employeeName;
            this.employeeId = employeeId;
        }

        void displayEmployee() {
            System.out.println("Employee: " + employeeName + " (ID: " + employeeId + ")");
        }
    }

    static class Developer extends Employee {
        String programmingLanguage;

        Developer(String name, int id, String programmingLanguage) {
            super(name, id);
            this.programmingLanguage = programmingLanguage;
        }

        void writeCode() {
            System.out.println(employeeName + " is writing code in " + programmingLanguage + ".");
        }
    }

    static class Manager extends Employee {
        String department;

        Manager(String name, int id, String department) {
            super(name, id);
            this.department = department;
        }

        void conductMeeting() {
            System.out.println(employeeName + " is conducting a meeting for the " + department + " department.");
        }
    }

    public static void main(String[] args) {
        Developer d = new Developer("Rahul", 11, "Java");
        Manager m = new Manager("Sakshi", 12, "Engineering");
        d.displayEmployee();
        d.writeCode();
        System.out.println();
        m.displayEmployee();
        m.conductMeeting();
        System.out.println();
        System.out.println("Inherited from Employee: employeeName, employeeId, displayEmployee()");
        System.out.println("Developer only: programmingLanguage, writeCode()");
        System.out.println("Manager only: department, conductMeeting()");
    }
}
