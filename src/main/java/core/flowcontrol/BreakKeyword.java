package core.flowcontrol;

/**
 * @author Meganathan Subramaniyan
 * @since 2021-july-02 09-25AM
 * @version 2021-v1
 * https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp
 */
public class BreakKeyword {
    public static void main(String[] args) {
        boolean b = false;

        /*
         * multiple blocks using break keyword.
         * used if conditional statement and else block.
         */
        first:
        {
            second:
            {
                third:
                {
                    if (b) {
                        System.out.println("third");
                        break second;

                    } else {
                        System.out.println("I am else block of third block");
                    }
                }
                System.out.println("I am from second block");
            }
            System.out.println("I am from third block");
        }
    }
}
