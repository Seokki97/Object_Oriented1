package baseballgame2;

import baseballgame.Ball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    private static final int MAX_NUMBER_LENGTH =3;

    public List<Integer> makeRandomNumber(List<Integer> randomNumber){
        Random randomNum = new Random();
        while (randomNumber.size() < MAX_NUMBER_LENGTH) {  //자바 상수에 대해 구글에 검색하여 찾아보아요.
            randomNumber.add(randomNum.nextInt(9 - (1) + 1) + (1));
            randomNumber = new ArrayList<>(randomNumber.stream().distinct().toList());
        }
        return randomNumber;

    }
}
