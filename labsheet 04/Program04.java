public class Program04 {
    static class Employee {
        int empId;
        double salary;
        static String companyName = "TechNova Pvt Ltd";

        Employee(int id, double sal) {
            empId = id;
            salary = sal;
        }

        void display() {
            int id = empId;
            double pay = salary;
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Salary: " + pay);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, 45000);
        Employee e2 = new Employee(102, 52000);
        e1.display();
        System.out.println();
        e2.display();
    }
}
