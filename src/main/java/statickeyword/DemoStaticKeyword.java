package staticKeyword;

public class DemoStaticKeyword {
    static int a = 25;
    static int b;

    static {
        b = a + 5;
    }

    static int setValue(int c) {
        int value = c > a ? b : a;
        return value;
    }

    public static void main(String[] args) {
        int sum = setValue(50);
        System.out.println(sum);
    }
}
