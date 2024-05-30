//1. use of super with super varible
//2. use of super with method
class Vehical {
    int maxSpeed = 120;

    public Vehical() {
        System.out.println("Hello Jii Kaise ho");
    }

    void message() {
        System.out.println("This is Vehical class \n");
    }
}

class Car extends Vehical {
    int maxSpeed = 100;

    public Car() {
        super(); // constructor of parent class cal
        System.out.println("Child class constructor");
    }

    void display() {
        System.out.println("Maximum speed : " + super.maxSpeed);
    }

    void message() {
        System.out.println("This is Car class \n");
    }

    void dis() {
        message();
        super.message();
    }
}

public class Super1 {
    public static void main(String[] args) {

        Car c = new Car();
        c.display();
        c.dis();
    }
}
