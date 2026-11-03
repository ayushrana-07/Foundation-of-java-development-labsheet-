public class Program15 {
    static class Shape {
        double calculateArea() { return 0; }
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) { this.radius = radius; }

        @Override
        double calculateArea() { return 3.14159 * radius * radius; }
    }

    static class Rectangle extends Shape {
        double length, breadth;

        Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        double calculateArea() { return length * breadth; }
    }

    public static void main(String[] args) {
        Shape c = new Circle(7);
        Shape r = new Rectangle(10, 4.5);
        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Area of Rectangle: " + r.calculateArea());
    }
}
