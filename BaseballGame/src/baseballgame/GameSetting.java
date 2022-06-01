package baseballgame;

import java.util.List;

public class GameSetting {
    protected Ball ball;
    protected Computer computer;
    protected Player player;

    protected GameSetting() {
        ball = new Ball();
        player = new Player();
    }

    public void determineStrikeOrBall() {
        ball.makeStrike(player, computer);
        ball.makeBall(player, computer);
    }

    public List<Integer> setComputerValue() {
        computer = new Computer(); //여기서 초기화를 안시켜주면 계속 같은 난수만 생성되기 때문에

        computer.setRandomInteger();
        return computer.getComputerAnswerValue();
    }

    public List<Integer> setPlayerValue(){
        player.setPersonValue();
        return player.getPersonValue();
    }

    public void showScoreMessage(){
        ball.showStrikeMessage();
        ball.showBallMessage();
        ball.showNothingMessage();
    }


}
