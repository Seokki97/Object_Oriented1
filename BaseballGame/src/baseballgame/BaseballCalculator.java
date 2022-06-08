package baseballgame;

import java.util.List;

public class BaseballCalculator {
    private static final int INITIALIZE_OF_BALLS_COUNT = 0;
    private static final int BALL_MAX_SIZE = 3;
    private static final int INITIAL_NUMBER = -1;

    private int strike;
    private long ball;

    private void divideMethodFromMakeStrike(List<Integer> playerNumber, List<Integer> randomNumber, int index) {
        if (playerNumber.get(index) == randomNumber.get(index)) {
            strike++;
            playerNumber.set(index, INITIAL_NUMBER);
        }
    }

    public int calculateStrike(PlayerNumber playerNumber, RandomNumber randomNumber) {
        initializeStrike();
        int index;
        for (index = 0; index < BALL_MAX_SIZE; index++) {
            divideMethodFromMakeStrike(playerNumber.getPlayerNumber(), randomNumber.getRandomNumber(), index);
        }
        return strike;
    }

    public long calculateBall(PlayerNumber playerNumber, RandomNumber randomNumber) {
        initializeBall();
        for (int index = 0; index < BALL_MAX_SIZE; index++) {
            int finalindex = index;
            ball += playerNumber.getPlayerNumber().stream()
                    .filter(p -> p.equals(randomNumber.getRandomNumber().get(finalindex))).count();
        }
        return ball;
    }

    public int initializeStrike() {
        strike = INITIALIZE_OF_BALLS_COUNT;
        return strike;
    }

    public long initializeBall() {
        ball = INITIALIZE_OF_BALLS_COUNT;
        return ball;
    }

    public int getStrikeCount() {
        return strike;
    }

    public long getBallCount() {
        return ball;
    }


}
