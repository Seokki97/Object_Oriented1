package baseballgame;

import java.util.List;

public class GameSetting {
    Ball ball;
    Computer computer;
    Player player;

    /*

        현재 객체의 필드(상태) 인스턴스들이 Default 접근 제한자로 되어있어요.
        객체의 필드(상태)의 접근 제한자를 설정할 때는 보통 private 접근 제한자를 사용하곤 하는데요.
        왜 접근 제한자를 Default 또는 public 접근 제한자를 사용하면 안될까요?
        그리고, 현재 필드들의 접근 제한자를 변경해보아요.
     */
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
        System.out.println(computer.getComputerAnswerValue().toString());
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
