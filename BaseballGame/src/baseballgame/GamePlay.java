package baseballgame;

import java.util.Scanner;

public class GamePlay {
    Ball ball;
    Computer computer;
    Player player;
    Scanner sc = new Scanner(System.in);

    public GamePlay() {
        ball = new Ball();
        computer = new Computer();
        player = new Player();
    }

    public void bringGame() {
        ball.makeStrike(player.getIntArray(), computer.getRandomSetting());
        ball.makeBall(player.getIntArray(), computer.getRandomSetting());
        System.out.println(this);
    }

    public void playGame() {
        computer.setRandomInteger();

        while (true) {
            player.convertToArray();
            bringGame();
            if (ball.getStrike() == 3) {
                System.out.println(endMessage());
                setPlaying();
                break;
            }
        }
    }

    public String endMessage() {
        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요";
    }

    public void setPlaying() {
        if (sc.nextInt() == 1) {
            playGame();
        } else if (sc.nextInt() == 2) {
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        if (ball.getStrike() == 0 && ball.getBall() == 0) {
            return "낫싱";
        } else return ball.getStrike() + "스트라이크" + ball.getBall() + "볼";
    }

}