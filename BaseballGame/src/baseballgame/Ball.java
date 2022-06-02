package baseballgame;

import java.util.List;

public class Ball {
    private final int INITIAL_NUM = -1;
    protected static final int MAX_SIZE = 3;
    private int strike;
    private int ball;

    public int makeStrike(List<Integer> player, List<Integer> computer) {
        strike = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            if (player.get(i) == computer.get(i)) {
                strike++;
                player.set(i, INITIAL_NUM);
            }
        }
        return strike;
    }

    public int makeBall(List<Integer> player, List<Integer> computer) {
        ball = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < MAX_SIZE; j++) {
                if (player.get(i) == computer.get(j)) {
                    ball++;
                }
            }
        }
        return ball;
    }

    /* public long makeBall(Player player, Computer computer){
        long ball =0;
        for(int i=0; i<MAX_SIZE;i++) {
            int finalI = i;
            ball += player.getPerson().stream()
                    .filter(p -> p.equals(computer.getComputerAnswerValue().get(finalI)))
                    .collect(Collectors.counting());
        }
         return ball;
     }*/
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

    public void setBall(int ball) {
        this.ball = ball;
    }
}
