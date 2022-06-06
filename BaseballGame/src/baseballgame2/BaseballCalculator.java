package baseballgame2;


import java.util.List;
import java.util.stream.Collectors;

public class BaseballCalculator {
    private final int BALL_MAX_SIZE =3;
    private final int INITIAL_NUMBER =-1;

    int strike;
    int ball;

    private void divideMethodFromMakeStrike(List<Integer> player, List<Integer> computer, int i) {
        strike = 0;
        if (player.get(i) == computer.get(i)) {
            strike++;
            player.set(i, INITIAL_NUMBER);
        }
    }
    public int calculateStrike(PlayerNumber player, RandomNumber computer) {
        strike = 0;
        int i;
        for (i = 0; i < BALL_MAX_SIZE; i++) {
            int finalI = i;
            divideMethodFromMakeStrike(player.playerNumber, computer.computerNumber1, finalI);
        }
        return strike;
    }

    public long calculateBall(PlayerNumber player, RandomNumber computer) {
        ball = 0;
        for (int i = 0; i < BALL_MAX_SIZE; i++) {
            int finalI = i;
            ball += player.playerNumber.stream()
                    .filter(p -> p.equals(computer.computerNumber1.get(finalI)))
                    .collect(Collectors.counting());
        }
        return ball;
    }
}
