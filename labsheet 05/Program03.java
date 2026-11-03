public class Program03 {
    static class Employee {
        private int employeeId;
        private String employeeName;
        private double salary;

        public int getEmployeeId() { return employeeId; }
        public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
        public String getEmployeeName() { return employeeName; }
        public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
        public double getSalary() { return salary; }

        public void setSalary(double salary) {
            if (salary < 0) {
                System.out.println("Rejected: salary cannot be negative (" + salary + ")");
            } else if (salary > 1000000) {
                System.out.println("Rejected: salary cannot be greater than 1,000,000 (" + salary + ")");
            } else {
                this.salary = salary;
                System.out.println("Salary accepted: " + salary);
            }
        }

        public void displayDetails() {
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Name: " + employeeName);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeId(301);
        e.setEmployeeName("Karan Mehta");
        e.setSalary(55000);
        e.setSalary(-1000);
        e.setSalary(2500000);
        System.out.println();
        e.displayDetails();
    }
}
