package baseballgame;

public class BaseballApplication {
    private String showEndMessage() {
        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요";
    }

    public static void main(String[] args) {
        GamePlay PlayingGame = new GamePlay();
        BaseballApplication b1 = new BaseballApplication();

        while(true) {
            PlayingGame.playGame();
            System.out.println(b1.showEndMessage());
            PlayingGame.restartOrEndGame();
        }

        }
}
