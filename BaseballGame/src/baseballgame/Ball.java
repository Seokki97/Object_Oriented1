package baseballgame;

import java.util.List;
import java.util.stream.Collectors;

public class Ball {
    final int INITIAL_NUM = -1;
    static final int MAX_SIZE = 3;
    private int strike;
    private int ball;

    /*
        필드(상태)의 접근제한자가 각기 다르군요.
        이러면 어떤문제가 있을까요?
        변경해봅시다. 또한, 객체의 캡슐화란 무엇일까요?
     */

    public int makeStrike(Player player, Computer computer) {
        strike = 0;
         for (int i = 0; i < MAX_SIZE; i++) {
            if (player.getPerson().get(i) == computer.getComputerAnswerValue().get(i)) {
                strike++;
                player.getPerson().set(i, INITIAL_NUM);
            }
        }
        return strike;
    }
    /*
        for문의 depth가 3이예요. 변경해봅시다.
       */

    public int makeBall(Player player, Computer computer) {
        ball = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            for (int j = 0; j < MAX_SIZE; j++) {
                if (player.getPerson().get(i) == computer.getComputerAnswerValue().get(j)) {
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
    public void strikeMessage() {
        if (strike > 0) {
            System.out.print(strike + "스트라이크");
        }
    }

    public void ballMessage() {
        if (ball > 0) {
            System.out.println(ball + "볼");
        }
    }

    public void nothingMessage() {
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
