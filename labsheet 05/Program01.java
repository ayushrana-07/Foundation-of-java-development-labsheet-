public class Program01 {
    static class Student {
        private String name;
        private int rollNo;
        private double marks;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getRollNo() { return rollNo; }
        public void setRollNo(int rollNo) { this.rollNo = rollNo; }
        public double getMarks() { return marks; }
        public void setMarks(double marks) { this.marks = marks; }

        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aarav Sharma");
        s.setRollNo(21);
        s.setMarks(86.5);
        System.out.println("Using getters:");
        System.out.println(s.getName() + " | " + s.getRollNo() + " | " + s.getMarks());
        System.out.println();
        s.displayDetails();
    }
}
