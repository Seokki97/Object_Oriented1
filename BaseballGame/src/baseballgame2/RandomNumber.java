package baseballgame2;

import baseballgame.Ball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    private static final int MAX_NUMBER_LENGTH =3;
    private static final int MAX_RANDOM_NUMBER=9;
    private static final int MIN_RANDOM_NUMBER=1;
    public List<Integer> randomNumber ;

    public List<Integer> makeRandomNumber() {
        Random randomNum = new Random();

        while (randomNumber.size() < MAX_NUMBER_LENGTH) {  //자바 상수에 대해 구글에 검색하여 찾아보아요.
            randomNumber.add(randomNum.nextInt(MAX_RANDOM_NUMBER - (MIN_RANDOM_NUMBER) + MIN_RANDOM_NUMBER) + (MIN_RANDOM_NUMBER));
            randomNumber = new ArrayList<>(randomNumber.stream().distinct().toList());
        }
        return randomNumber;
    }
    public List<Integer> getRandomNumber(){
        return randomNumber;
    }
}
