public class Program11 {
    static class Person {
        String name;

        Person(String name) { this.name = name; }

        void displayName() { System.out.println("Name: " + name); }
    }

    static class Student extends Person {
        String course;

        Student(String name, String course) {
            super(name);
            this.course = course;
        }

        void study() { System.out.println(name + " is studying " + course + "."); }
    }

    static class Teacher extends Person {
        String subject;

        Teacher(String name, String subject) {
            super(name);
            this.subject = subject;
        }

        void teach() { System.out.println(name + " is teaching " + subject + "."); }
    }

    public static void main(String[] args) {
        Student s = new Student("Ishaan", "BCA");
        Teacher t = new Teacher("Dr. Anjali Joshi", "Java");
        s.displayName();
        s.study();
        System.out.println();
        t.displayName();
        t.teach();
    }
}
