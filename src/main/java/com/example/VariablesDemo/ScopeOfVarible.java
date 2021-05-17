package com.example.VariablesDemo;

public class ScopeOfVarible {
    int i = 0;

    void run() {
        System.out.println("This is block :" + i); //Here we can't able to access instance variable to local(with in method)
        int i = 10;
        System.out.println("This is block @ reassigned value to i :" + i);
    }

    void dis() {
        int i = 0;
        System.out.println("This method" + i); //Here we can't able to access instance variable to local(with in method)
    }

    void list() {
        //int i = 0;
        for (int i = 0; i < 10; i++) //Here saying you already declared 'i'
        {

        }
    }

    void addition() {
        for (int j = 0; j < 10; j++) {

        }
        int j = 0; /* Here 1st inner loop executed that variable will destroyed,
                        so after we can use same datatype variable and vslues also */
    }

    public static void main(String[] args)
    {
        ScopeOfVarible scope=new ScopeOfVarible();
        scope.run();
        scope.dis();

        for(int k=0;k<10;k++)
        {
            System.out.println(k);
        }
        int k;
        //System.out.println(k); // Here must need to be initialize the variable in static area.
    }
}
