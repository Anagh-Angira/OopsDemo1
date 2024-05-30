public class Overriding1 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        Anil obj = new Anil();
        obj.m1();
        obj.m2();
    }

}

class Anagh {
    final void show() {

    }
}

class Aman extends Anagh {

    // @Override compile Time Error
    // void show() {

    // }
}

class Anil {

    static void m1() {
        System.out.println("From parent "
                + "static m1()");
    }

    void m2() {
        System.out.println(
                "From parent "
                        + "non - static(instance) m2() ");
    }
}

class Sunil extends Anil {

    // @Override not allowed
    static void m1() {
        System.out.println("From child static m1()");
    }

    public void m2() {
        System.out.println(
                "From child "
                        + "non - static(instance) m2() ");
    }
}

// private method cannot be overriden
// The overriding method must have the same return type (or subtype)
// Invoking overridden method from sub-class
