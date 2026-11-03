public class Program13 {
    static class Temperature {
        double celsius;
        static String scale = "Celsius";

        Temperature(double c) {
            celsius = c;
        }

        void convert() {
            double fahrenheit = (celsius * 9 / 5) + 32;
            double kelvin = celsius + 273.15;
            System.out.println("Scale: " + scale);
            System.out.println("Celsius: " + celsius);
            System.out.println("Fahrenheit: " + fahrenheit);
            System.out.println("Kelvin: " + kelvin);
        }
    }

    public static void main(String[] args) {
        Temperature t = new Temperature(36.6);
        t.convert();
    }
}
