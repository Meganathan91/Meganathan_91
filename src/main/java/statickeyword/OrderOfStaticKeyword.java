package staticKeyword;

public class OrderOfStaticKeyword {
    static int i;

    OrderOfStaticKeyword() {
        System.out.println("welcome");
    }

    static {
        i = 10;
        display();
        System.out.println("i am third");
    }

    static {
        System.out.println("i am first");
    }

    static void getNumber(int i) {
        System.out.println(i);
    }

    void dis() {
        System.out.println(i);// we can access static variable in static and no static method.
    }

    public static void main(String[] args) {
        OrderOfStaticKeyword order = new OrderOfStaticKeyword();
        getNumber(15);
    }

    static {
        System.out.println("i am second");
    }

    static void display() {
        System.out.println(i);
    }
}
