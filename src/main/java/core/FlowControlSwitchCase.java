package core;

import java.util.Scanner;
/**
 * @author Meganathan Subramaniyan
 * @since 2021-july-02 09-25AM
 * @version 2021-v1
 * https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/?ref=lbp
 */
public class FlowControlSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        /**
         * In switch case some primitive and object types input only allowed,
         * That is byte, short, int, char those are primitive types.
         * Byte, Short, Integer, Character, String are object types.
         */
        switch (mark) {
            case 87:
                System.out.println("Mark in tamil");
                break;
            case 56:
            case 98:
                System.out.println("Mark in English"); // branch statement in switch.
                break;
            case 78:
                System.out.println("Mark in Science");
                break;
            case 76:
                System.out.println("Mark in SocialScience");
                break;
            default:
                System.out.println("subject not available");
                break;
        }
    }
}
