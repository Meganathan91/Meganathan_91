package staticKeyword;

class Parent {
    static int getNum(int a, int b) {
        int addition = a + b;
        return addition;
    }
}

public class MethodOverriding extends Parent {

    static int getNum(int a, int b) {
        int subtraction = a - b;
        return subtraction;
    }

    public static void main(String[] args) {

        Parent aStatic = new MethodOverriding();// calling parent class method, Because this is respect to object not class.
        int num = aStatic.getNum(10, 5);
        System.out.println(num);
        MethodOverriding overriding=new MethodOverriding();
        int num1=getNum(5 ,10);
        System.out.println(num1);

    }
}
