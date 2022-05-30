package baseballgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Computer {
    final int MAX_LENGTH =3;
    private List<Integer> randomSetting = new ArrayList<>();
    List<Integer> sex = new ArrayList<>();
    /*
        배열보다는 Collection Api를 사용해볼까요?
        그리고 randomSetting이라는 네이밍은 Computer가 가지고 있는 정답 난수들이라는것을 잘 표현 해줄까요?
        randomSetting을 바꾸어보아요.
        그리고 배열보다 Collection Api를 사용해야 하는 이유는 무엇일까요?
     */

    public List<Integer> getRandomSetting() {
        return randomSetting;
    }

    public List<Integer> setRandomInteger() {
        Random randomNum = new Random();

        while (sex.size() < MAX_LENGTH) {  //자바 상수에 대해 구글에 검색하여 찾아보아요.
            randomSetting.add(randomNum.nextInt(9 - (1) + 1) + (1));
            sex =randomSetting.stream().distinct().toList();
        }
        return sex;
    }

    }



