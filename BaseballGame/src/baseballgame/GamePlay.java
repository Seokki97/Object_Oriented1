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

    public void endGameCondition(){
            System.out.println(showEndMessage());
            restartOrEndGame();
    }

    public void playGame() {
        computer.setRandomInteger();
        System.out.println(computer.getComputerAnswerValue());

            do { // while문이 종료되는 조건에 true가 들어있군요. while (true)로 되어있는 이유가 있을까요?
                player.setPersonValue(sc.nextInt());
                determineStrikeOrBall();
                ball.strikeMessage();
                ball.ballMessage();
            } while (ball.getStrike() < 3);
                    endGameCondition();
    }

    private String showEndMessage() {
        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요";
        // 이 메서드는 사용자에게 게임 결과를 출력하는 일을 하죠. 과연 숫자야구 게임 진행의 역할을 하는 GamePlay가 해야할 일일까요?
        // 또한 객체 외부에서 호출하는 메서드가 아닌 내부에서 사용하는 메서드는 접근 제한자를 private으로 잠궈주어야 해요.
    }

    public void restartOrEndGame() {
        if (sc.nextInt() == 1) { // if문 안의 조건식을 보면 사용자 입력이 1이면 게임을 다시시작한다는 것을 나타내 주는데요. 이 조건식을 다른사람이 본다면 직관적으로 이해 할 수 있을까요? 직관적으로 이애하기 쉽도록 변경해봅시다.
            playGame();
        } else if (sc.nextInt() == 2) { // 위와 같아요.
            System.exit(0);
        }
    }
}
