package baseballgame;

import java.util.Scanner;

public class GamePlay extends GameSetting {

    Scanner playerInput = new Scanner(System.in);

    private void inputPlayerNum() {
        player.input = playerInput.nextLine();
        player.stringToList();
    }

    public void playGame() {
        setComputerValue();

        while (ball.getStrike() < 3) {
            inputPlayerNum();
            setPlayerValue();
            determineStrikeOrBall();
            showScoreMessage();

        }
    }

    public void restartOrEndGame() {
        String playerInputToString = playerInput.nextLine();

        if (playerInputToString.equals("1")) {
            computer.getComputerAnswerValue().clear();
            ball.setStrike(0);
            ball.setBall(0);
            playGame();
        }
        if (playerInputToString.equals("2")) {
            System.exit(0);
        }
    }
}

