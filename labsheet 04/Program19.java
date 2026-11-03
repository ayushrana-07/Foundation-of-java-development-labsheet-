public class Program19 {
    static class Product {
        int id;
        String name;
        double price;
        static double discountRate = 10;

        Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        void showFinalPrice() {
            double discount = price * discountRate / 100;
            double finalPrice = price - discount;
            System.out.println("Product ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
            System.out.println("Discount (" + discountRate + "%): " + discount);
            System.out.println("Final Price: " + finalPrice);
        }
    }

    public static void main(String[] args) {
        Product p = new Product(501, "Wireless Mouse", 1200);
        p.showFinalPrice();
    }
}
