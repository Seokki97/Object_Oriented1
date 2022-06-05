package baseballgame2;

import java.util.List;
import java.util.stream.Collectors;

public class BaseballCalculator {
    private final int BALL_MAX_SIZE =3;
    private final int INITIAL_NUMBER =-1;

    int strike;
    int ball;
    private void divideMethodFromMakeStrike(Player player, Computer computer, int i) {
        strike = 0;
        if (player.playerNumber.get(i) == computer.computerNumber.get(i)) {
            strike++;
            player.playerNumber.set(i, INITIAL_NUMBER);
        }
    }
    public int calculateStrike(Player player, Computer computer) {
        strike = 0;
        int i;
        for (i = 0; i < BALL_MAX_SIZE; i++) {
            divideMethodFromMakeStrike(player, computer, i);
        }
        return strike;
    }

    public long calculateBall(Player player, Computer computer) {
        ball = 0;
        for (int i = 0; i < BALL_MAX_SIZE; i++) {
            int finalI = i;
            ball += player.playerNumber.stream()
                    .filter(p -> p.equals(computer.computerNumber.get(finalI)))
                    .collect(Collectors.counting());
        }
        return ball;
    }

}
