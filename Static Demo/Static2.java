class Test {
    static int a = m2();

    static {
        System.out.println("Inside static block");
    }

    static int m2() {
        System.out.println("from m1");
        return 20;
    }
}

public class Static2 {

    private static String a;

    public static void main(String[] args) {

        System.out.println("Value of a : " + a);
        System.out.println("from main");
    }

}
