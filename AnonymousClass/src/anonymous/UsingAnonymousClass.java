package anonymous;

abstract class Laptops {
    abstract void message();
}

public class UsingAnonymousClass {
    public static void main(String args[]) {
        Laptops lr = new Laptops() {
            @Override
            void message() {
                System.out.println("This is from anonymous class");
            }
        };
        lr.message();
    }
}
