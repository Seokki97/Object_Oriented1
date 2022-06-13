package model;

import java.util.Random;

public class FowardCondition {
    private static final int RANDOM_NUMBERS_BOUND = 10;
    private static final int FOWARD_CAR_CONDITION = 4;


    public int makeRandomNumber(){
        Random randomUtil = new Random();
        int randomNumber = randomUtil.nextInt(RANDOM_NUMBERS_BOUND);

        return randomNumber;
    }

    public boolean fowardCarCondition(int randomNumber){

        if(randomNumber >= FOWARD_CAR_CONDITION){
            return true;
        }
        return false;
    }
}
