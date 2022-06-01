package baseballgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    private List<Integer> randomValue = new ArrayList<>();
    private List<Integer> computerAnswerValue = new ArrayList<>();

    public void setRandomInteger() {
        Random randomNum = new Random();

        while (computerAnswerValue.size() < Ball.MAX_SIZE) {  //자바 상수에 대해 구글에 검색하여 찾아보아요.
            randomValue.add(randomNum.nextInt(9 - (1) + 1) + (1));
            computerAnswerValue = randomValue.stream().distinct().toList();
        }
    }

    public List<Integer> getComputerAnswerValue() {
        return computerAnswerValue;
    }

}



