package baseballgame;

import java.util.List;
import java.util.stream.Collectors;

public class Ball {
    private final int INITIAL_NUM = -1;
    protected static final int MAX_SIZE = 3;
    private int strike;
    private long ball;

    private void divideMethodFromMakeStrike(List<Integer> player, List<Integer> computer, int i) {
        if (player.get(i) == computer.get(i)) {
            strike++;
            player.set(i, INITIAL_NUM);
        }
    }

    public int makeStrike(List<Integer> player, List<Integer> computer) {
        strike = 0;
        int i;
        for (i = 0; i < MAX_SIZE; i++) {
            divideMethodFromMakeStrike(player, computer, i);
        }
        return strike;
    }

    public long makeBall(List<Integer> player, List<Integer> computer) {
        ball = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            int finalI = i;
            ball += player.stream()
                    .filter(p -> p.equals(computer.get(finalI)))
                    .collect(Collectors.counting());
        }
        return ball;
    }

    public void showStrikeMessage() {
        if (strike > 0) {
            System.out.print(strike + "스트라이크");
        }
    }

    public void showBallMessage() {
        if (ball > 0) {
            System.out.println(ball + "볼");
        }
    }

    public void showNothingMessage() {
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        }
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public void setBall(long ball) {
        this.ball = ball;
    }
}
