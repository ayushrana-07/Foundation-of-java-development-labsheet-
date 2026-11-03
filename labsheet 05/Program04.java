public class Program04 {
    static class Animal {
        void eat() { System.out.println("The animal is eating."); }
        void sleep() { System.out.println("The animal is sleeping."); }
    }

    static class Dog extends Animal {
        void bark() { System.out.println("The dog is barking."); }
    }

    public static void main(String[] args) {
        System.out.println("Animal");
        System.out.println("  |");
        System.out.println("  v");
        System.out.println(" Dog");
        System.out.println();
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.bark();
    }
}
