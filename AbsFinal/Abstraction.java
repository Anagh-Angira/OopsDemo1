
//Abstract class may contains abstract as well as concreate method
//if class contain abstract method class must declare abstract
//abstract method are those not having implementation part we have to inherit this class make body
//If regular class inherit abstract class it must implement all the abstract method present of parent class
//Abstact class cannot be instantiated we cannot create object of Abstract class

abstract class Shape { // create the abstract class
    String color;

    public Shape(String color) {
        System.out.println("shape constructor called");
        this.color = color;
    }

    public abstract double area();

    public abstract String toString();

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor()
                + "and area is : " + area();
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length,
            double width) {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }

}
