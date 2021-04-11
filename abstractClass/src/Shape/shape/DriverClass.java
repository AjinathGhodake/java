package shape;

public class DriverClass {
    public static void main(String args[]) {
        Shape sh1 = new Circle("red", 10);
        Shape sh2 = new Rectangle("blue", 5, 10);
        double length =3;
        Shape sq = new Shape("Yellow") {

            @Override
            double area() {
                return Math.pow(length, 2);
            }

            @Override
            public String toString() {
                return "The Square Color is :" + super.color + " The Square area is " + area();
            }
        };
        System.out.println("The Circle Info :" + sh1.toString());
        System.out.println("The Rectangle Info :" + sh2.toString());
        System.out.println("The Square Info :" + sq.toString());
    }
}
