package baseballgame2;
import java.util.List;
import java.util.stream.Collectors;

public class BaseballCalculator {
    private final int BALL_MAX_SIZE =3;
    private final int INITIAL_NUMBER =-1;
    private final int INITIAL_COUNT=0;
    private int strike;
    private long ball;


    public void divideMethodFromMakeStrike(List<Integer> playerNumber, List<Integer> randomNumber, int i) {
        if (playerNumber.get(i) == randomNumber.get(i)) {
            strike++;
            playerNumber.set(i, INITIAL_NUMBER);
        }
    }
    public int calculateStrike(PlayerNumber playerNumber, RandomNumber randomNumber) {
        int i;
        for (i = 0; i < BALL_MAX_SIZE; i++) {
            divideMethodFromMakeStrike(playerNumber.getplayerNumber(), randomNumber.getRandomNumber(), i);
        }
        return strike;
    }

    public long calculateBall(PlayerNumber playerNumber, RandomNumber randomNumber) {
        for (int i = 0; i < BALL_MAX_SIZE; i++) {
            int finalI = i;
            ball += playerNumber.getplayerNumber().stream()
                    .filter(p -> p.equals(randomNumber.getRandomNumber().get(finalI)))
                    .collect(Collectors.counting());
        }
        return ball;
    }

    public int getStrikeCount(){
        if(strike != 3) {
            return strike = INITIAL_COUNT;
        }
        return strike;
    }
    public long getBallCount(){
        if(ball != 3){
            return ball = INITIAL_COUNT;
        }
        return ball;
    }


}
