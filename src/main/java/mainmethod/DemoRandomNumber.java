package mainmethod;

import java.util.Random;

public class DemoRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i =1; i<=3; i++) {
            int num = random.nextInt(5);
            if(num == 0) {
               num += 1;

            } System.out.println(num);
        }
    }
}
