package staticKeyword;

class Base {
    static void operation(int x, int y) {
        int division = x / y;
    }
}

public class StaticReference {
    static void operation(int a, int b) {
        int sum = a + b;
    }

    public static void main(String[] args) {
        operation(10, 5);
        Base.operation(25,5);
    }
}
