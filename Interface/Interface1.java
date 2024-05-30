public class Interface1 implements In1 {
    public void display2() {
        System.out.println("Hello Displayed");
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Interface1 ob = new Interface1();
        ob.display2();
        System.out.println(ob.a);

    }
}

interface In1 {
    final int a = 10;

    default void display3() {

    }

    public static void run() { // public is allowed only

    }

    @SuppressWarnings("unused")
    private void done() {

    }

    public abstract void display2();
}

// Interface achieve 100% abstracton
// Achieve Multiple Inheritance
// use to achieve loose coupling : not totally depend on each other
// methods : public abstract method only allow
/*
 * in java 8 version :
 * we create default concreate method
 * static method create
 * create private method also
 */

// feilds are of public static final :
// eg: public static final int a = 10;