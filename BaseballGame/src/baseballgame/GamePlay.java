package baseballgame;
import java.util.Scanner;

public class GamePlay extends GameSetting {

    Scanner sc = new Scanner(System.in);

    public void input() {
        player.input = sc.nextLine();
        player.stringToList();
    }

    public void playGame() {
        setComputerValue();
        while (ball.getStrike() < 3) {
            input();
            setPlayerValue();
            determineStrikeOrBall();
            showScoreMessage();

        }
    }

    public void restartOrEndGame() {
        String sda = sc.nextLine();
        if (sda.equals("1")) {
            computer.getComputerAnswerValue().clear();
            ball.setStrike(0);
            ball.setBall(0);
            playGame();
        }
        if (sda.equals("2")) {
            System.exit(0);
        }
    }
}

