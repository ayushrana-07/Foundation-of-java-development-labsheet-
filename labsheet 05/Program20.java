public class Program20 {
    interface Researcher {
        void conductResearch();
    }

    static class Employee {
        private int employeeId;
        private String employeeName;
        private double salary;

        Employee(int employeeId, String employeeName, double salary) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.salary = salary;
        }

        public int getEmployeeId() { return employeeId; }
        public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
        public String getEmployeeName() { return employeeName; }
        public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
        public double getSalary() { return salary; }
        public void setSalary(double salary) { this.salary = salary; }

        public void displayDetails() {
            System.out.println("ID: " + employeeId);
            System.out.println("Name: " + employeeName);
            System.out.println("Base Salary: " + salary);
        }

        public double calculateSalary() { return salary; }
    }

    static class Teacher extends Employee implements Researcher {
        private String subject;

        Teacher(int id, String name, double salary, String subject) {
            super(id, name, salary);
            this.subject = subject;
        }

        public void teach() {
            System.out.println(getEmployeeName() + " is teaching " + subject + ".");
        }

        @Override
        public void conductResearch() {
            System.out.println(getEmployeeName() + " is conducting research in " + subject + ".");
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Subject: " + subject);
        }

        @Override
        public double calculateSalary() {
            return super.calculateSalary() + 8000;
        }
    }

    static class VisitingTeacher extends Teacher {
        private int hoursWorked;

        VisitingTeacher(int id, String name, double hourlyRate, String subject, int hoursWorked) {
            super(id, name, hourlyRate, subject);
            this.hoursWorked = hoursWorked;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Hours Worked: " + hoursWorked);
        }

        @Override
        public double calculateSalary() {
            return getSalary() * hoursWorked;
        }
    }

    static class Admin extends Employee {
        private String department;

        Admin(int id, String name, double salary, String department) {
            super(id, name, salary);
            this.department = department;
        }

        public void manageDepartment() {
            System.out.println(getEmployeeName() + " is managing the " + department + " department.");
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Department: " + department);
        }

        @Override
        public double calculateSalary() {
            return super.calculateSalary() + 5000;
        }
    }

    public static void main(String[] args) {
        System.out.println("            Employee");
        System.out.println("            /      \\");
        System.out.println("      Teacher      Admin");
        System.out.println("   (+Researcher)");
        System.out.println("           |");
        System.out.println("   VisitingTeacher");
        System.out.println();

        Employee e = new Employee(1, "Ramesh Thapa", 30000);
        Teacher t = new Teacher(2, "Dr. Meenal Pant", 60000, "Computer Science");
        VisitingTeacher v = new VisitingTeacher(3, "Prof. Alok Dutt", 1200, "Mathematics", 40);
        Admin a = new Admin(4, "Savita Rana", 35000, "Examination");

        Employee[] staff = {e, t, v, a};
        for (Employee emp : staff) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());
            System.out.println("------------------------");
        }

        t.teach();
        t.conductResearch();
        v.teach();
        v.conductResearch();
        a.manageDepartment();

        Researcher r = t;
        r.conductResearch();

        e.setSalary(32000);
        System.out.println("Updated salary of " + e.getEmployeeName() + ": " + e.getSalary());
    }
}
