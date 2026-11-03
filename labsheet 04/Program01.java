public class Program01 {
    static class Student {
        String name;
        int age;
        static int count = 0;

        void setDetails(String n, int a) {
            String studentName = n;
            int studentAge = a;
            name = studentName;
            age = studentAge;
            count++;
        }

        void display() {
            String info = "Name: " + name + ", Age: " + age;
            System.out.println(info);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails("Aarav", 19);
        Student s2 = new Student();
        s2.setDetails("Riya", 20);
        s1.display();
        s2.display();
        System.out.println("Total students: " + Student.count);
    }
}
