public class Program07 {
    static class Animal {
        void eat() { System.out.println("Animal eats food."); }
    }

    static class Dog extends Animal {
        void bark() { System.out.println("Dog barks."); }
    }

    static class Puppy extends Dog {
        void play() { System.out.println("Puppy plays with a ball."); }
    }

    public static void main(String[] args) {
        System.out.println("Animal");
        System.out.println("  |");
        System.out.println("  v");
        System.out.println("Dog");
        System.out.println("  |");
        System.out.println("  v");
        System.out.println("Puppy");
        System.out.println();
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
    }
}
