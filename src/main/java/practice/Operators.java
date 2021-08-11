package practice;

public class Operators {


    public static void main(String[] args) {
       int i =  (0101 | 0011);
        int i1 =  (0101 & 0011);
        int i2 =  (0101 ^ 0011);
        int i3 =  ( ~ 0011);

        System.out.println(i + " " + i1 + " " + i2 + " " +i3 );

        int x = 10;
        int y = 19;

        if( x == 10 || y == 20)
            System.out.println("welcome");

        if( x == 10 && y == 20) {
            System.out.println("welcome");
        } else {
            System.out.println("wait");
        }

    }
}
