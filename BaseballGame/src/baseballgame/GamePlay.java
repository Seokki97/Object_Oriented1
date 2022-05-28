package baseballgame;

import java.util.Scanner;

public class GamePlay {
    Ball ball = new Ball();
    Computer com = new Computer();
    Player p1 = new Player();

    Scanner sc = new Scanner(System.in);

    @Override
    public String toString() {

        ball.makeStrike(p1.getInput(), com.getSetting());
        ball.makeBall(p1.getInput(), com.getSetting());
        ball.makeNothing(p1.getInput(), com.getSetting());

        if (ball.strike == 0 && ball.ball == 0) {
            return ball.nothing;
        } else return ball.strike + "스트라이크" + ball.ball + "볼";
    }

    public void play() {
        System.out.println(this);
    }

    public void doPlaying() {
        com.setRandomInteger();

        while (true) {
            p1.stringToArray();
            play();

            if (ball.strike == 3) {
                System.out.println(endMessage());
                setPlaying();
                break;
            }
        }
    }

    public String endMessage() {

        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료" +
                "게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요";
    }

    public void setPlaying() {
        if (sc.nextInt() == 1) {
            doPlaying();
        } else if (sc.nextInt() == 2) {
            System.exit(0);
        }

    }
}