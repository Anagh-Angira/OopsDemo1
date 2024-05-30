public class Inheritance2 {
    public static void main(String[] args) {
        B obj_B = new B();
        obj_B.print_A();
        obj_B.print_B();

        C obj_C = new C();
        obj_C.print_A();
        obj_C.print_C();

        D obj_D = new D();
        obj_D.print_A();
        obj_D.print_D();

    }
}

class A {
    public void print_A() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void print_B() {
        System.out.println("Class B");
    }
}

class C extends A {
    public void print_C() {
        System.out.println("Class C");
    }
}

class D extends A {
    public void print_D() {
        System.out.println("Class D");
    }
}
/*
 * In The Case of Interface it is Possible
 * The problem occurs when there exist methods with the same signature in both
 * the superclasses and subclass. On calling the method, the compiler cannot
 * determine which class method to be called and even on calling which class
 * method gets the priority.
 */

class Parent1 {

    void fun() {
        System.out.println("Parent1");
    }
}

class Parent2 {

    void fun() {
        System.out.println("Parent2");
    }
}

// This is Compile Time Error
// class TextMain extends Parent1, Parent2 {

// }