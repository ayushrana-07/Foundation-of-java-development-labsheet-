public class Program30 {
    static class Library {
        int booksAvailable;
        static String libraryName = "Central City Library";

        Library(int books) {
            booksAvailable = books;
        }

        void issueBook(int quantity) {
            int current = booksAvailable;
            if (quantity > current) {
                System.out.println("Cannot issue " + quantity + " book(s). Only " + current + " available.");
            } else {
                int updated = current - quantity;
                booksAvailable = updated;
                System.out.println(quantity + " book(s) issued. Available now: " + updated);
            }
        }

        void returnBook(int quantity) {
            int current = booksAvailable;
            int updated = current + quantity;
            booksAvailable = updated;
            System.out.println(quantity + " book(s) returned. Available now: " + updated);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library(50);
        System.out.println("Library: " + Library.libraryName);
        System.out.println("Books available: " + lib.booksAvailable);
        lib.issueBook(5);
        lib.issueBook(60);
        lib.returnBook(3);
    }
}
