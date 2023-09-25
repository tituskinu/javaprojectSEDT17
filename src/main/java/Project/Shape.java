package Project;
/*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.
 */
public interface Shape {
    double calculateArea(double radius);
    double calculatePerimeter(double side);
}

class Circle implements Shape {
    double radius;

    public double calculateArea(double radius) {
        double area= 3.14159 * radius * radius;
        return area;
    }

    public double calculatePerimeter(double radius) {
        double perimeter= 2 * 3.14159 * radius;
        return perimeter;
    }
}
class Square implements Shape {
    double side;
    @Override
    public double calculateArea(double side) {
        double area= side * side;
        return area;
    }
    @Override
    public double calculatePerimeter(double side) {
        double perimeter= 4 * side;
        return perimeter;
    }
}
class test {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("Circle Area: " + circle.calculateArea(5.0));
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter(4.0));

        Square square = new Square();
        System.out.println("Square Area: " + square.calculateArea(6.0));
        System.out.println("Square Perimeter: " + square.calculatePerimeter(3.0));
    }
}