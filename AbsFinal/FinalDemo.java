//value of final variable cannot be changed
//final method cannot be override 
//final class cannot be inherit

final class Parent {

}

// class Child extends Parent { compilation error

// }

class A {
    final void m1() {
        System.out.println("Final Method Hii");
    }
}

class B extends A {

    // void m1() { compilation error
    // System.out.println("Final Method Hii");
    // }
}

public class FinalDemo {
    public static void main(String[] args) {

        final double PI = 3.14;
        System.out.println("Value of PI " + PI);

    }

}
