public class Annonymous1 {

    public static void main(String[] args) {

        // MyClass obj = new MyClass();
        // obj.getAge();
        Age ob1 = new Age() {
            @Override
            public void getAge() {
                // printing age
                System.out.print("Age is " + x);
            }
        };
        ob1.getAge();
    }

}

interface Age {
    int x = 21;

    void getAge();
}

class MyClass implements Age {

    @Override
    public void getAge() {

        System.out.println("Age is : " + x);
    }

}
