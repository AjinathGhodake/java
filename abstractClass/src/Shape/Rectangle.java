package Shape;

public class Rectangle extends Shape {
    double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        System.out.println("The Rectangles constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "The color of Rectangle is :" + super.color + " The area of rectangle is :" + area();
    }
}
