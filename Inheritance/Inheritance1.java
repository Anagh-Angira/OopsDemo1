public class Inheritance1 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
        Child c = new Child();
        c.doJob();
        c.study();

        Three t = new Three();
        t.print_for();
        t.print_geek();
        t.print_lastgeek();

    }

}

class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak(int decre) {
        speed -= decre;
    }

    public void speedUp(int incre) {
        speed += incre;
    }

    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }

}
// single Inheritance

class Parent {
    public void doJob() {
        System.out.println("Amazon");
    }
}

class Child extends Parent {
    public void study() {
        System.out.println("DAV");
    }
}

// Multilevel Inheritance
class One {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

class Two extends One {
    public void print_for() {
        System.out.println("for");
    }
}

class Three extends Two {
    public void print_lastgeek() {
        System.out.println("Geeks");
    }
}
