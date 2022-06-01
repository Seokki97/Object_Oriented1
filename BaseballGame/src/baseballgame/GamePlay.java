package baseballgame;

import java.util.Scanner;

public class GamePlay {
    Ball ball;
    Computer computer;
    Player player;
    Scanner sc = new Scanner(System.in);

    /*

        현재 객체의 필드(상태) 인스턴스들이 Default 접근 제한자로 되어있어요.
        객체의 필드(상태)의 접근 제한자를 설정할 때는 보통 private 접근 제한자를 사용하곤 하는데요.
        왜 접근 제한자를 Default 또는 public 접근 제한자를 사용하면 안될까요?
        그리고, 현재 필드들의 접근 제한자를 변경해보아요.
     */
    public GamePlay() {
        ball = new Ball();
        computer = new Computer();
        player = new Player();
    }

    public void determineStrikeOrBall() { // 객체 외부에서 호출하는 메서드가 아닌 내부에서 사용하는 메서드는 접근 제한자를 private으로 잠궈주어야 해요.
        ball.makeStrike(player, computer);
        ball.makeBall(player, computer);
    }

    public void input() {
        player.input = sc.nextLine();
        player.stringToList();
    }

    public void setComputerValue() {
        computer.setRandomInteger();
    }

    public void setPlayerValue(){
        player.setPersonValue();
    }

    public void getValue() {
        player.getPerson();
        computer.getComputerAnswerValue();
    }

    public void message(){
        ball.strikeMessage();
        ball.ballMessage();
    }
    public void playGame() {
        setComputerValue();
        while (true) {
            input();

            setPlayerValue();

            getValue();

            determineStrikeOrBall();

            message();

            if (ball.getStrike() == 3) {
                break;
            }
        }

    }

}
