package baseballgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Computer {
    final int MAX_LENGTH =3;
    private List<Integer> randomValue = new ArrayList<>();
    private List<Integer> computerAnswerValue = new ArrayList<>();

    public List<Integer> setRandomInteger() {
        Random randomNum = new Random();

        while (computerAnswerValue.size() < MAX_LENGTH) {  //자바 상수에 대해 구글에 검색하여 찾아보아요.
            randomValue.add(randomNum.nextInt(9 - (1) + 1) + (1));
            computerAnswerValue =randomValue.stream().distinct().toList();
        }
        return computerAnswerValue;
    }

    public List<Integer> getComputerAnswerValue() {
        return computerAnswerValue;
    }

    }



