package Innerclass;

public class Learninner {

    class Toy {

        int price;
    }

    static class Boy {
        String name;
    }

    public static void main(String[] args) {

        // Toy t = new Toy();
        // System.out.println(t.price = 23);

        // Method-1
        Toy t = new Learninner().new Toy();
        System.out.println(t.price = 23);

        // Method-2
        Learninner ob = new Learninner();
        Toy tt = ob.new Toy();
        System.out.println(tt.price = 34);

        // Boy b = new Boy();
        Boy b = new Learninner.Boy();

        System.out.println(b.name = "ram");
    }

}

// USES code Reuseability achieve Encapsulation
