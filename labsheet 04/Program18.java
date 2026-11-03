public class Program18 {
    static class ElectricBill {
        int units;
        static double fixedCharge = 50;

        ElectricBill(int u) {
            units = u;
        }

        void calculateBill() {
            double energyCharge;
            if (units <= 100) {
                energyCharge = units * 3.0;
            } else if (units <= 300) {
                energyCharge = 100 * 3.0 + (units - 100) * 5.0;
            } else {
                energyCharge = 100 * 3.0 + 200 * 5.0 + (units - 300) * 7.0;
            }
            double total = energyCharge + fixedCharge;
            System.out.println("Units consumed: " + units);
            System.out.println("Energy charge: " + energyCharge);
            System.out.println("Fixed charge: " + fixedCharge);
            System.out.println("Total bill: " + total);
        }
    }

    public static void main(String[] args) {
        new ElectricBill(250).calculateBill();
    }
}
