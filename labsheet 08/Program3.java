class Product<T, U> {
    T id;
    U price;

    Product(T id, U price) {
        this.id = id;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID : " + id);
        System.out.println("Product Price : " + price);
    }
}

public class Program3 {
    public static void main(String[] args) {
        Product<Integer, Double> p1 = new Product<>(101, 25050.00);
        Product<Integer, Double> p2 = new Product<>(102, 5000.00);
        Product<Integer, Double> p3 = new Product<>(103, 750.75);

        p1.display();
        p2.display();
        p3.display();
    }
}
