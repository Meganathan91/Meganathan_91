package core.flowcontrol;

public class BreakKeyword {
    public static void main(String[] args) {
        boolean b = true;
        first:
        {
            second:
            {
                third:
                {
                    if (b) {
                        System.out.println("third");
                        break second;

                    }
                }
                System.out.println("I am from second block");
            }
            System.out.println("I am from third block");
        }
    }
}
