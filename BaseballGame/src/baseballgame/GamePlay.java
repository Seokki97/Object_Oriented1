package baseballgame;

import java.util.Scanner;

public class GamePlay  {
    //3스트라이크면 게임완료 아니면 계속
    Ball ball = new Ball();
    Computer com = new Computer();
    Player p1 = new Player();

    Scanner sc = new Scanner(System.in);
    //게임완료

    //재시작 OR 종료

    public void play(){
        ball.makeStrike(p1.getInput(), com.getSetting());
        ball.makeBall(p1.getInput(), com.getSetting());
        ball.makeNothing(p1.getInput(), com.getSetting());
        System.out.println(ball.toString());
    }

    public void doPlaying(){
        com.randomBob();
        do{
            p1.stringToArray();
            play();

        } while(ball.strike ==3);

    }

    public String endGame(){

        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료" +
                "게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요";
    }

    public void restartOrEnd() {
        if (sc.nextInt() == 1) {
            doPlaying();
        } else {
            System.out.println("끝");
        }
    }
}