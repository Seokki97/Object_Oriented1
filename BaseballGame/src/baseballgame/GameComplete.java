package baseballgame;
import baseballgame.GamePlay;

public class GameComplete {

    private String showEndMessage() {
        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요";
        // 이 메서드는 사용자에게 게임 결과를 출력하는 일을 하죠. 과연 숫자야구 게임 진행의 역할을 하는 GamePlay가 해야할 일일까요?
        // 또한 객체 외부에서 호출하는 메서드가 아닌 내부에서 사용하는 메서드는 접근 제한자를 private으로 잠궈주어야 해요.
    }

    /*public void restartOrEndGame(int input) {
        if (input == 1) { // if문 안의 조건식을 보면 사용자 입력이 1이면 게임을 다시시작한다는 것을 나타내 주는데요. 이 조건식을 다른사람이 본다면 직관적으로 이해 할 수 있을까요? 직관적으로 이애하기 쉽도록 변경해봅시다.
            playGame();
        } else if (input == 2) { // 위와 같아요.
            System.exit(0);
        }*/


    public void endGameCondition() {
        System.out.println(showEndMessage());
        //  restartOrEndGame();
    }

}
