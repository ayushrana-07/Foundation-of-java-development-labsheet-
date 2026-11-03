public class Program02 {
    static class Rectangle {
        double length;
        double breadth;
        static String shapeName = "Rectangle";

        Rectangle(double l, double b) {
            length = l;
            breadth = b;
        }

        double calculateArea() {
            double area = length * breadth;
            return area;
        }

        void displayArea() {
            double result = calculateArea();
            System.out.println("Shape: " + shapeName);
            System.out.println("Length: " + length + ", Breadth: " + breadth);
            System.out.println("Area: " + result);
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(12.5, 6);
        r.displayArea();
    }
}
