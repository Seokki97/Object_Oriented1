package baseballgame;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Computer {

    private int[] setting = new int[3];

    public int[] getSetting() {
        return setting;
    }

    public void setSetting(int[] setting) {
        this.setting = setting;
    }

    public String randomBob() {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            setting[i] = rand.nextInt(9 -(1)+1)+(1);
            for (int j = 0; j < i; j++) {
                if (setting[i] == setting[j]) {
                    i--;
                }
            }
        }
        return Arrays.toString(setting);
    }

}
