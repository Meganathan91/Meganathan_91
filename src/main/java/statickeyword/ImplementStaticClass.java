package staticKeyword;

public class ImplementStaticClass {
    private static String color = "red";
    private final int days = 7;

    static class StaticClass {
        void staticClassMethod() {
            ImplementStaticClass.color = "yellow";
            System.out.println(color);
        }

    }

    class InnerClass {
        void innerClassPrint() {
            System.out.println(color + " " + days);
        }

    }

    public static void main(String[] args) {
        ImplementStaticClass.StaticClass aClass = new ImplementStaticClass.StaticClass();
        ImplementStaticClass.InnerClass aClass1 = new ImplementStaticClass().new InnerClass();
        aClass.staticClassMethod();
        aClass1.innerClassPrint();
    }
}