public class This3 {
    public static void main(String[] args) {

    }
}

// 6 Using ‘this’ keyword as an argument in the constructor call
class A {
    B obj;

    A(B obj) {
        this.obj = obj;
        obj.display();
    }
}

class B {
    int x = 5;

    B() {
        // A obj = new A(this);
    }

    void display() {
        System.out.println("Value of x in Class B : " + x);
    }
}