public class Program17 {
    interface Printer {
        void print();
    }

    interface Scanner {
        void scan();
    }

    static class MultiFunctionMachine implements Printer, Scanner {
        private String machineName;
        private int machineId;

        public String getMachineName() { return machineName; }
        public void setMachineName(String machineName) { this.machineName = machineName; }
        public int getMachineId() { return machineId; }
        public void setMachineId(int machineId) { this.machineId = machineId; }

        @Override
        public void print() { System.out.println(machineName + " is printing a document."); }

        @Override
        public void scan() { System.out.println(machineName + " is scanning a document."); }
    }

    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.setMachineName("Canon MF-240");
        m.setMachineId(9087);
        System.out.println("Machine: " + m.getMachineName() + " (ID: " + m.getMachineId() + ")");
        m.print();
        m.scan();
    }
}
