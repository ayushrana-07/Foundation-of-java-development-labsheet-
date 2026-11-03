public class Program09 {
    static class Laptop {
        String brand;
        int RAM;
        static String os = "Windows";

        Laptop(String b, int r) {
            brand = b;
            RAM = r;
        }

        void display() {
            String laptopBrand = brand;
            int laptopRam = RAM;
            System.out.println("Brand: " + laptopBrand);
            System.out.println("RAM: " + laptopRam + " GB");
            System.out.println("OS: " + os);
        }
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 16);
        Laptop l2 = new Laptop("HP", 8);
        l1.display();
        System.out.println();
        l2.display();
    }
}
