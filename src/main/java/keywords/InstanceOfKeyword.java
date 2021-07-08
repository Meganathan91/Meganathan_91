package keywords;

import com.Array.Example_Array$Copy;

import java.util.StringJoiner;

public class InstanceOfKeyword {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 10;
            //int num = 10 / 0;
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                //System.out.println("e instanceof ArrayIndexOutOfBoundsException");
                try {
                    findArrayIndexOutOfBoundsException();
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                }
            } else if (e instanceof StringIndexOutOfBoundsException) {
                //System.out.println("e instanceof StringIndexOutOfBoundsException");
                findStringIndexOutOfBoundsException();
            } else if (e instanceof Exception) {
                //System.out.println("e instanceof ArithmeticException");
                findArithmeticException();
            }
        }
    }

    static void findArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");

    }

    static void findStringIndexOutOfBoundsException() {
        throw new StringIndexOutOfBoundsException("StringIndexOutOfBoundsException");

    }

    static void findArithmeticException() {
        throw new ArithmeticException("Divide by zero");

    }
}
