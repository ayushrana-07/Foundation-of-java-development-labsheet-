public class Program13 {
    static class Animal {
        void makeSound() { System.out.println("The animal makes a sound."); }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() { System.out.println("The dog barks: Woof! Woof!"); }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() { System.out.println("The cat meows: Meow! Meow!"); }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        a.makeSound();
        d.makeSound();
        c.makeSound();
    }
}
