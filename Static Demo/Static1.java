//Only class level variables are static 

public class Static1 {
    static int a = 10;
    static int b;

    static { // static block
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    static void m1() {
        System.out.println("from m1");
    }

    public static void main(String[] args) {

        m1();
        System.out.println("from main");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}
