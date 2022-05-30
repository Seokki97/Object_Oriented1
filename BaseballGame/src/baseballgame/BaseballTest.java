package baseballgame;

public class BaseballTest {
    /*
        보통 xxxTest라는 네이밍은 테스트 코드를 작성할 때 사용하곤해요.
        이 객체는 우리 프로그램의 시작점이 되는 객체로 보이네요.
        네이밍을 프로그램의 시작점이라는 것을 알 수 있도록 변경해보아요. (ex. Application, BaseBallApplication 등)
     */

    public static void main(String[] args) {
        // 이 부분에 공백을 둔 이유가 무엇일까요?
        GamePlay PlayingGame = new GamePlay();
        /*
            player1 이라는 네이밍이 GamePlay라는 객체를 잘 설명하는 인스턴스명일까요?
            다른 이름으로 바꿔 봅시다.
            그리고 요구사항에 있는 입출력과 실제 어플리케이션을 실행했을때 입출력이
            맞지 않아요. 요구사항에 있는 입출력과 같은 입출력이 되도록 수정해봅시다.
         */
        try {
            PlayingGame.playGame();
        } catch (InputException e){
            System.out.println(e);
        }
    }
}
