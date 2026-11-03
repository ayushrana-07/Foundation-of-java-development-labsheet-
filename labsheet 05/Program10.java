public class Program10 {
    static class Animal {
        void eat() { System.out.println("Animal is eating."); }
    }

    static class Dog extends Animal {
        void bark() { System.out.println("Dog says Woof!"); }
    }

    static class Cat extends Animal {
        void meow() { System.out.println("Cat says Meow!"); }
    }

    public static void main(String[] args) {
        System.out.println("     Animal");
        System.out.println("     /    \\");
        System.out.println("   Dog    Cat");
        System.out.println();
        Dog d = new Dog();
        Cat c = new Cat();
        System.out.print("Dog: ");
        d.eat();
        d.bark();
        System.out.print("Cat: ");
        c.eat();
        c.meow();
    }
}
