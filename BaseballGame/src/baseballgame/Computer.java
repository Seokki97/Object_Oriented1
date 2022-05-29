package baseballgame;

import java.util.Arrays;
import java.util.Random;

public class Computer {

    private int[] computerSetting = new int[Ball.SIZE];

    public int[] getSetting() {
        return computerSetting;
    }

    public String setRandomInteger() {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            computerSetting[i] = rand.nextInt(9 -(1)+1)+(1);
            for (int j = 0; j < i; j++) {
                if (computerSetting[i] == computerSetting[j]) {
                    i--;
                }
            }
        }
        return Arrays.toString(computerSetting);
    }

}
