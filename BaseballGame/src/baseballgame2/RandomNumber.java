package baseballgame2;

import baseballgame.Ball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    private static final int MAX_NUMBER_LENGTH = 3;
    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int MIN_RANDOM_NUMBER = 1;
    private List<Integer> randomNumber = new ArrayList<>();

    public List<Integer> makeRandomNumber() {
        Random randomNum = new Random();
        List<Integer> asd = new ArrayList<>();

        do { //자바 상수에 대해 구글에 검색하여 찾아보아요.
            asd.add(randomNum.nextInt(MAX_RANDOM_NUMBER - (MIN_RANDOM_NUMBER) + MIN_RANDOM_NUMBER) + (MIN_RANDOM_NUMBER));
            asd.stream().distinct().toList();
        } while (asd.size() < MAX_NUMBER_LENGTH);
        randomNumber = asd;
        return randomNumber;
    }

    public List<Integer> getRandomNumber() {
        return randomNumber;
    }
}
