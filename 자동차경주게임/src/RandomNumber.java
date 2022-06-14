import java.util.Random;

public class RandomNumber {
    private static final int RANDOM_NUMBERS_BOUND = 10;

    public int makeRandomNumber(){
        Random randomUtil = new Random();
        int randomNumber = randomUtil.nextInt(RANDOM_NUMBERS_BOUND);
        return randomNumber;
        }

    }
