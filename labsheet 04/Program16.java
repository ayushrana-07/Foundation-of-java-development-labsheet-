public class Program16 {
    static class Triangle {
        double a, b, c;
        static String type = "Scalene/Isosceles/Equilateral";

        Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        void check() {
            boolean valid = (a + b > c) && (b + c > a) && (a + c > b);
            if (!valid) {
                System.out.println("Sides " + a + ", " + b + ", " + c + " do not form a valid triangle.");
                return;
            }
            String kind;
            if (a == b && b == c) {
                kind = "Equilateral";
            } else if (a == b || b == c || a == c) {
                kind = "Isosceles";
            } else {
                kind = "Scalene";
            }
            System.out.println("Possible types: " + type);
            System.out.println("Sides " + a + ", " + b + ", " + c + " form a valid " + kind + " triangle.");
        }
    }

    public static void main(String[] args) {
        new Triangle(5, 5, 5).check();
        new Triangle(5, 5, 8).check();
        new Triangle(3, 4, 5).check();
        new Triangle(1, 2, 10).check();
    }
}
