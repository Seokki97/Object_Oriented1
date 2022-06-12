package baseballgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    private static final int MAX_NUMBER_LENGTH = 3;
    private static final int MAX_RANDOM_NUMBER = 9;
    private static final int MIN_RANDOM_NUMBER = 1;
    private List<Integer> randomNumber ;

    public RandomNumber(){
        randomNumber = new ArrayList<>(makeRandomNumber());
    }
    public List<Integer> makeRandomNumber() {
        Random randomNum = new Random();
        List<Integer> duplicateNumbersRemove = new ArrayList<>();

        while (duplicateNumbersRemove.size() < MAX_NUMBER_LENGTH) {
            duplicateNumbersRemove.add(randomNum.nextInt(MAX_RANDOM_NUMBER - (MIN_RANDOM_NUMBER)
                    + MIN_RANDOM_NUMBER) + (MIN_RANDOM_NUMBER));
            duplicateNumbersRemove = new ArrayList<>(duplicateNumbersRemove.stream().distinct().toList());
        }
        return duplicateNumbersRemove;
    }

    public List<Integer> getRandomNumber() {
        return randomNumber;
    }
}
