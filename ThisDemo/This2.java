
public class This2 {

    public static void main(String[] args) {
        W obj = new W();
        obj.get().display();

    }

}

class C {
    void show1() {
        this.display(); // 5. Using ‘this’ keyword to invoke the current class method
        System.out.println("Hello i am in show1 method");
    }

    void display() {
        System.out.println("I am in display Method");
    }
}

class W {
    int a, b;

    W() {
        a = 10;
        b = 20;
    }

    W get() {
        return this; // Using ‘this’ keyword to return the current class instance
    }

    void display() {
        System.out.println("Hello I am Anagh Angira..");
    }

    void dis(W obj) {
        System.out.println("a " + obj.a + " b " + obj.b);
    }

    void getis() {
        dis(this); // 4. Using ‘this’ keyword as a method parameter
    }
}
