public class Program10 {
    static class Movie {
        String name;
        String genre;
        double rating;
        static String industry = "Bollywood";

        Movie(String n, String g, double r) {
            name = n;
            genre = g;
            rating = r;
        }

        void display() {
            String movieName = name;
            String movieGenre = genre;
            double movieRating = rating;
            System.out.println("Movie: " + movieName);
            System.out.println("Genre: " + movieGenre);
            System.out.println("Rating: " + movieRating + "/10");
            System.out.println("Industry: " + industry);
        }
    }

    public static void main(String[] args) {
        Movie m = new Movie("3 Idiots", "Comedy Drama", 8.4);
        m.display();
    }
}
