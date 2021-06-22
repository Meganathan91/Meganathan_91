package program;

public class ProgramForOperator {
     ProgramForOperator(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        ProgramForOperator program=new ProgramForOperator();
        //unary operators

        int p=10;
        int q=5;
        System.out.println(p+(p/q)*q-p);
        System.out.println(p++ + q);
        int a1 = 10;
        System.out.println(a1+1);
        int b1 = 12;
        System.out.println(b1-1);
         a1 =  a1++ + b1;
        System.out.println(a1);
        int b = 12;
        System.out.println(++b);
        int c = 13;
        System.out.println(c--);
        int d = 19;
        System.out.println(--d);
        System.out.println(d);
        int e = 5;
        System.out.println(+e);
        int f = 9;
        System.out.println(-f);
        System.out.println(e + f);

        //assignment operators
        int g = 10;
        System.out.println(g += 5);
        int h = 5;
        System.out.println(h -= 10);
        int i = 5;
        System.out.println(i *= 9);
        int j = 5;
        System.out.println(j /= 5);

        //relational operators
        System.out.println(i == 45);
        System.out.println(j != 1);
        int k = 10;
        System.out.println(g <= 5);
        int l = 5;
        System.out.println(h >= 10);
        int m = 5;
        System.out.println(i > 9);
        int n = 5;
        System.out.println(j < 5);
        int x = 1;
        System.out.println(n == 5 && x == 10);
        System.out.println(n == 5 || x == 10);
        int aa=(n > x) ? 10 : 5;
        System.out.println(aa);

    }
}
