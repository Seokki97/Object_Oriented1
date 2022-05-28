package baseballgame;

import java.util.Random;

public class Computer {

    private int[] setting = new int[3];

    public int[] getSetting() {
        return setting;
    }

    public void setSetting(int[] setting) {
        this.setting = setting;
    }

    public int[] randomBob(){
        Random rand = new Random();
        for(int i = 0 ; i< 3; i++){
         setting[i] = rand.nextInt(9);
        }
    return setting;
    }
}
