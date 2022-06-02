package baseballgame;

public class BaseballApplication {
    private String showEndMessage() {
        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요";
    }

    public static void main(String[] args) {
        BaseballApplication b1 = new BaseballApplication();
        GameSetting playing = new GameSetting();
        while(true) {
            playing.playGame();
            System.out.println(b1.showEndMessage());
            playing.restartOrEndGame();
        }

        }
}
