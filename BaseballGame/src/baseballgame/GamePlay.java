package baseballgame;

import java.util.Scanner;

public class GamePlay extends GameSetting{

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
            int input = sc.nextInt();
            if (input == 1) { // if문 안의 조건식을 보면 사용자 입력이 1이면 게임을 다시시작한다는 것을 나타내 주는데요. 이 조건식을 다른사람이 본다면 직관적으로 이해 할 수 있을까요? 직관적으로 이애하기 쉽도록 변경해봅시다.
                playGame();
            } else if (input == 2) { // 위와 같아요.
                System.exit(0);
            }
        }
    }

