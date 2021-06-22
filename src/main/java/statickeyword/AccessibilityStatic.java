package staticKeyword;

public class AccessibilityStatic {
    int a;
    int b;

    AccessibilityStatic() {
        b++;
    }
void increment(){
        b++;
}

    static void getValue() {
        //System.out.println(a += 1); Non-static variable a not referred in static method.
    }

    void printValue() {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        AccessibilityStatic staticVariables = new AccessibilityStatic();
        staticVariables.printValue();
        //b++;
        staticVariables.increment();
        staticVariables.printValue();
        getValue();

    }

}
