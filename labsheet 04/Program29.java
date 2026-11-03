public class Program29 {
    static class Employee {
        String name;
        double salary;
        static String organization = "Infosys";

        Employee(String n, double s) {
            name = n;
            salary = s;
        }

        void compare(Employee other) {
            double mySalary = this.salary;
            double theirSalary = other.salary;
            System.out.println("Organization: " + organization);
            if (mySalary > theirSalary) {
                double diff = mySalary - theirSalary;
                System.out.println(this.name + " earns " + diff + " more than " + other.name);
            } else if (mySalary < theirSalary) {
                double diff = theirSalary - mySalary;
                System.out.println(other.name + " earns " + diff + " more than " + this.name);
            } else {
                System.out.println(this.name + " and " + other.name + " earn the same salary");
            }
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Vikas", 60000);
        Employee e2 = new Employee("Priya", 72000);
        e1.compare(e2);
    }
}
