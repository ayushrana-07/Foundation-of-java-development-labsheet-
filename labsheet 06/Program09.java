// Q9. Create method1(), method2() and method3(). Generate an ArithmeticException in method3(), propagate it through the methods and handle it in main().
class Program09 {
    static void method3() {
        int result = 10 / 0;
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled in main().");
        }
    }
}
