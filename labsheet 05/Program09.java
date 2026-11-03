public class Program09 {
    static class Vehicle {
        void start() { System.out.println("Vehicle started."); }
        void stop() { System.out.println("Vehicle stopped."); }
    }

    static class Car extends Vehicle {
        void drive() { System.out.println("Car is being driven."); }
    }

    static class ElectricCar extends Car {
        void chargeBattery() { System.out.println("Electric car battery is charging."); }
    }

    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.drive();
        ec.chargeBattery();
        ec.stop();
    }
}
