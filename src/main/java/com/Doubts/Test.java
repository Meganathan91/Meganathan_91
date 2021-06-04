package com.Doubts;

abstract class Base {
    abstract void sample(String a);
}

class Base1 extends Base {

    @Override
    void sample(String a) {
        System.out.println("Base1 :" + a);
    }
}

class Base2 extends Base {

    @Override
    void sample(String a) {
        System.out.println("Base2 :" + a);
    }

    public static void main(String[] args) {
        Base1 b1 = new Base1();
        Base2 b2 = new Base2();
        Base b[] = {b1, b2};
        for (Base b3 : b) {
            b3.sample("hi");
        }
    }
}
