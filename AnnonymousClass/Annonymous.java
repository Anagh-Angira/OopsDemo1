public class Annonymous {

    public static void main(String[] args) {

        Outer ob = new Outer() {
            @SuppressWarnings("unused")
            public void sing() {
                System.out.println("Hello");

            }

            public void outerMethod() {
                System.out.println("This is override method");
            }
        };
        ob.outerMethod();
        SuperInterface obj = new SuperInterface() {

            @Override
            public void interfaceDemo() {
                System.out.println("Hello World");
            }
        };
        obj.interfaceDemo();

    }
}

class Outer {

    public void outerMethod() {

    }
}

interface SuperInterface {

    public void interfaceDemo();
}