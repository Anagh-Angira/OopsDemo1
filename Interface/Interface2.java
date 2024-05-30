public class Interface2 {
    public static void main(String[] args) {

    }

}

interface Vehical1 {
    void changeGear(int a);

    void speedUp(int a);

    void applyBreak(int a);
}

class Bicycle implements Vehical1 {
    int speed;
    int gear;

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int incre) {
        speed = speed + incre;
    }

    @Override
    public void applyBreak(int decre) {
        speed = speed - decre;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}

class Bike implements Vehical1 {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    @Override
    public void applyBreak(int decrement) {

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}
