public class JavaTester {
    public static void main(String args[]) {
        JavaTester tester = new JavaTester();
        MathOperations addition = (a, b) -> a+b;
        MathOperations subtraction = (a, b) -> a-b;
        System.out.println("10 + 5 = "+tester.operate(10,5,addition));
        System.out.println("10 - 5 = "+tester.operate(10,5,subtraction));
    }

    interface MathOperations {
        int operations(int a, int b);
    }

    private int operate(int a, int b, MathOperations mathOperations) {
        return mathOperations.operations(a, b);
    }
}
