package baseballgame2;

import java.util.List;
import java.util.stream.Collectors;

public class BaseballCalculator {
    private final int INITIAL_COUNT = 0;
    private final int BALL_MAX_SIZE = 3;
    private final int INITIAL_NUMBER = -1;

    private int strike;
    private long ball;


    public void divideMethodFromMakeStrike(List<Integer> playerNumber, List<Integer> randomNumber, int i) {
        if (playerNumber.get(i) == randomNumber.get(i)) {
            strike++;
            playerNumber.set(i, INITIAL_NUMBER);
        }
    }

    public int calculateStrike(PlayerNumber playerNumber, RandomNumber randomNumber) {
        initializeStrike();
        int i;
        for (i = 0; i < BALL_MAX_SIZE; i++) {
            divideMethodFromMakeStrike(playerNumber.getplayerNumber(), randomNumber.getRandomNumber(), i);
        }
        return strike;
    }

    public long calculateBall(PlayerNumber playerNumber, RandomNumber randomNumber) {
        initializeBall();
        for (int i = 0; i < BALL_MAX_SIZE; i++) {
            int finalI = i;
            ball += playerNumber.getplayerNumber().stream()
                    .filter(p -> p.equals(randomNumber.getRandomNumber().get(finalI))).count();
        }

        return ball;
    }

    public int initializeStrike() {
        strike = INITIAL_COUNT;
        return strike;
    }

    public long initializeBall() {
        ball = 0;
        return ball;
    }

    public int getStrikeCount() {
        return strike;
    }

    public long getBallCount() {
        return ball;
    }


}
