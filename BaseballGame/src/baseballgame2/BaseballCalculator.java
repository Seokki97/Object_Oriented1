package baseballgame2;
import java.util.stream.Collectors;

public class BaseballCalculator {
    private final int BALL_MAX_SIZE =3;
    private final int INITIAL_NUMBER =-1;

    private int strike;
    private long ball;


    public void divideMethodFromMakeStrike(PlayerNumber playerNumber, RandomNumber randomNumber, int i) {
        strike = 0;
        if (playerNumber.setPersonValue().get(i) == randomNumber.getRandomNumber().get(i)) {
            strike++;
            playerNumber.setPersonValue().set(i, INITIAL_NUMBER);
        }
    }
    public int calculateStrike(PlayerNumber playerNumber, RandomNumber randomNumber) {
        strike = 0;
        int i;
        for (i = 0; i < BALL_MAX_SIZE; i++) {
            divideMethodFromMakeStrike(playerNumber, randomNumber, i);
        }
        return strike;
    }

    public long calculateBall(PlayerNumber playerNumber, RandomNumber randomNumber) {
        ball = 0;
        for (int i = 0; i < BALL_MAX_SIZE; i++) {
            int finalI = i;
            ball += playerNumber.setPersonValue().stream()
                    .filter(p -> p.equals(randomNumber.getRandomNumber().get(finalI)))
                    .collect(Collectors.counting());
        }
        return ball;
    }

    public int getStrikeCount(){
        return strike;
    }
    public long getBallCount(){
        return ball;
    }

}
