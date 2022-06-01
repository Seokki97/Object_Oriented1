package baseballgame;

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
                player.getPerson().set(i,INITIAL_NUM);
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

    /*
        for문의 depth가 4예요. 변경해봅시다.
        또한 매직넘버를 제거해봅시다.
        그리고 현재 구조에서 Ball 객체는 스트라이크와 볼의 개수를 판단하는 역할을 하는 것으로 보이는데,

     */
    public void strikeMessage() {
        if(strike >0) {
            System.out.print(strike + "스트라이크");
        }
    }

    public void ballMessage() {
        if(ball > 0) {
            System.out.print(ball + "볼");
        }
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

}
