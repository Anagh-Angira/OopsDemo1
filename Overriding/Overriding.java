public class Overriding {
    public static void main(String[] args) {
        Parents p = new Parents();
        p.name();
        p.m2();

        Childs c = new Childs();
        c.name();
        c.m2();
        c.m1();

    }
}

class Parents {
    void name() {
        System.out.println("Rajjeev Singh Malotra");
    }

    @SuppressWarnings("unused")
    private void m1() {
        System.out.println("From Parent m1()");
    }

    protected void m2() {
        System.out.println("From Parent m2()");
    }
}

class Childs extends Parents {

    @Override
    void name() {
        System.out.println("Aman Deep Ranjan");
        System.out.println("Ram Kumar Sharma");
    }

    // @SuppressWarnings("unused")
    public void m1() {
        System.out.println("from child m1()");
    }

    @Override
    public void m2() {
        System.out.println("from child m2()");
    }
}
