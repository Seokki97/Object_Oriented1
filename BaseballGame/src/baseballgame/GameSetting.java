package baseballgame;

import java.util.List;

public class GameSetting {
    protected Ball ball;
    protected Computer computer;
    protected Player player;

    public GameSetting() {
        ball = new Ball();
        player = new Player();
    }

    public void determineStrikeOrBall() { // 객체 외부에서 호출하는 메서드가 아닌 내부에서 사용하는 메서드는 접근 제한자를 private으로 잠궈주어야 해요.
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
        return player.getPerson();
    }

    public void showScoreMessage(){
        ball.strikeMessage();
        ball.ballMessage();
        ball.nothingMessage();
    }


}
