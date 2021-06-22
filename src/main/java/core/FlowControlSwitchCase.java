package core;

import java.util.Scanner;

public class FlowControlSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        switch (mark) {
            case 87:
                System.out.println("Mark in tamil");
                break;
            case 56:
                System.out.println("Mark in English");
                break;
            case 98:
                System.out.println("Mark in Maths");
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
