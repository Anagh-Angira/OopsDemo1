public class This1 {

    public static void main(String[] args) {

    }
}
// 1 this is use for current class instance variable

class Pack {
    int id;
    String name;

    Pack() {
        this(12, "aman ojha"); // 2 this is used for current class constructor
        System.out.println("Hello World");
    }

    Pack(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("id = " + id + "  name = " + name);
    }
}
