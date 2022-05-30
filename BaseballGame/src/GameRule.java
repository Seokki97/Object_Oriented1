public class GameRule {


    private String showEndMessage() { //view
        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요";
        // 이 메서드는 사용자에게 게임 결과를 출력하는 일을 하죠. 과연 숫자야구 게임 진행의 역할을 하는 GamePlay가 해야할 일일까요?
        // 또한 객체 외부에서 호출하는 메서드가 아닌 내부에서 사용하는 메서드는 접근 제한자를 private으로 잠궈주어야 해요.
    }
}
