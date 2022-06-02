package baseballgame;

import java.util.List;
import java.util.Scanner;

public class GameSetting {
    protected Ball ball;
    protected Computer computer;
    protected Player player;

    List<Integer> playerValue;
    List<Integer> computerValue;

    protected GameSetting() {
        ball = new Ball();
        player = new Player();
    }

    public List<Integer> copyplayerValue() {
        playerValue = player.getPersonValue();
        return playerValue;
    }

    public List<Integer> copyComputerValue() {
        computerValue = computer.getComputerAnswerValue();
        return computerValue;
    }

    public void determineStrikeOrBall() {
        copyplayerValue();
        copyComputerValue();

        ball.makeStrike(playerValue, computerValue);
        ball.makeBall(playerValue, computerValue);
    }

    public List<Integer> setComputerValue() {
        computer = new Computer(); //여기서 초기화를 안시켜주면 계속 같은 난수만 생성되기 때문에
        computer.setRandomInteger();
        return computer.getComputerAnswerValue();
    }

    public List<Integer> setPlayerValue() {
        player.setPersonValue();
        return player.getPersonValue();
    }

    Scanner playerInput = new Scanner(System.in);

    protected void inputPlayerNum() {
        player.input = playerInput.nextLine();
        player.stringToList();
    }

    public void showScoreMessage() {
        ball.showStrikeMessage();
        ball.showBallMessage();
        ball.showNothingMessage();
    }
}
