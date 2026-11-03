public class Program19 {
    interface Programmer {
        void writeCode();
    }

    interface Researcher {
        void conductResearch();
    }

    static class Employee {
        private String name;
        private int employeeId;

        Employee(String name, int employeeId) {
            this.name = name;
            this.employeeId = employeeId;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getEmployeeId() { return employeeId; }
        public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

        void displayEmployee() {
            System.out.println("Employee: " + name + " (ID: " + employeeId + ")");
        }
    }

    static class Developer extends Employee implements Programmer, Researcher {
        Developer(String name, int employeeId) { super(name, employeeId); }

        @Override
        public void writeCode() { System.out.println(getName() + " is writing code."); }

        @Override
        public void conductResearch() { System.out.println(getName() + " is researching new technologies."); }
    }

    public static void main(String[] args) {
        System.out.println("            Employee     Programmer  Researcher");
        System.out.println("                \\            |          /");
        System.out.println("                 \\           |         /");
        System.out.println("                      Developer");
        System.out.println();
        Developer d = new Developer("Tanvi Kapoor", 4501);
        d.displayEmployee();
        d.writeCode();
        d.conductResearch();
    }
}
