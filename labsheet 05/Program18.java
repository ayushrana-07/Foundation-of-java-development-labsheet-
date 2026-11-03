public class Program18 {
    interface Electric {
        void chargeBattery();
    }

    static class Vehicle {
        void start() { System.out.println("Vehicle started."); }
    }

    static class Car extends Vehicle {
        void drive() { System.out.println("Car is running on the road."); }
    }

    static class ElectricCar extends Car implements Electric {
        @Override
        public void chargeBattery() { System.out.println("Battery is charging."); }
    }

    public static void main(String[] args) {
        System.out.println("Vehicle");
        System.out.println("   |");
        System.out.println("   v");
        System.out.println("  Car");
        System.out.println("   |");
        System.out.println("   v");
        System.out.println("ElectricCar <---- Electric (interface)");
        System.out.println();
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.drive();
        ec.chargeBattery();
    }
}
