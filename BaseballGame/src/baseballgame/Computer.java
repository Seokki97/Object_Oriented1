package baseballgame;

import java.util.Arrays;
import java.util.Random;

public class Computer {

    private int[] randomSetting = new int[Ball.SIZE];

    public int[] getRandomSetting() {
        return randomSetting;
    }

    public String setRandomInteger() {
        Random rand = new Random();

        for (int i = 0; i < 3; i++) {
            randomSetting[i] = rand.nextInt(9 - (1) + 1) + (1);
            for (int j = 0; j < i; j++) {
                if (randomSetting[i] == randomSetting[j]) {
                    i--;
                }
            }
        }
        return Arrays.toString(randomSetting);
    }

}
