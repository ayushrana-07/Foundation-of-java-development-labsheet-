public class Program05 {
    static class Book {
        String title;
        String author;
        double price;
        static String publisher = "Penguin Books";

        void setDetails(String t, String a, double p) {
            String bookTitle = t;
            String bookAuthor = a;
            double bookPrice = p;
            title = bookTitle;
            author = bookAuthor;
            price = bookPrice;
        }

        void display() {
            String t = title;
            String a = author;
            double p = price;
            System.out.println("Title: " + t);
            System.out.println("Author: " + a);
            System.out.println("Price: " + p);
            System.out.println("Publisher: " + publisher);
        }
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setDetails("Wings of Fire", "A.P.J. Abdul Kalam", 299.0);
        b.display();
    }
}
