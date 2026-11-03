public class Program14 {
    static class Person {
        String name;
        int age;
        static String country = "India";

        Person(String n, int a) {
            name = n;
            age = a;
        }

        void checkVoting() {
            int minAge = 18;
            boolean eligible = age >= minAge;
            System.out.println(name + " from " + country + " is " + age + " years old.");
            if (eligible) {
                System.out.println("Eligible to vote.");
            } else {
                int yearsLeft = minAge - age;
                System.out.println("Not eligible. Wait " + yearsLeft + " more year(s).");
            }
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Karan", 22);
        Person p2 = new Person("Meera", 16);
        p1.checkVoting();
        p2.checkVoting();
    }
}
