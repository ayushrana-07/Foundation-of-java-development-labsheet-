public class Program06 {
    static class Car {
        String brand;
        double mileage;
        static int wheels = 4;

        Car(String b, double m) {
            brand = b;
            mileage = m;
        }

        void display() {
            String carBrand = brand;
            double carMileage = mileage;
            System.out.println("Brand: " + carBrand);
            System.out.println("Mileage: " + carMileage + " km/l");
            System.out.println("Wheels: " + wheels);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Maruti Swift", 22.4);
        Car c2 = new Car("Hyundai Creta", 17.0);
        c1.display();
        System.out.println();
        c2.display();
    }
}
