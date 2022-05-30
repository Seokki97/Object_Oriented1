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
    /*
        Scanner객체의 인스턴스를 GamePlay객체가 상태로 가지고 있군요.
        제가 보기에는 GamePlay객체가 야구게임의 룰에 따라 게임을 진행하면서 동시에 사용자에게 숫자를 입력받는 두가지 역할을 하는것 처럼 보여요.
        객체지향프로그래밍에서는 하나의 객체는 하나의 역할을 가지도록 하죠.
        객체지향프로그래밍에 대해서 공부해보아요. 그리고 GamePlay객체가 하나의 역할만 할 수 있도록 구조를 변경해보아요.
        마지막으로, 왜 하나의 객체는 하나의 역할만을 가져야 할 까요?
     */

    public GamePlay() {
        ball = new Ball();
        computer = new Computer();
        player = new Player();
    }

    public void bringGame() { // 객체 외부에서 호출하는 메서드가 아닌 내부에서 사용하는 메서드는 접근 제한자를 private으로 잠궈주어야 해요.
        //ball.makeStrike(player.getIntArray(), computer.getRandomSetting());
        //ball.makeBall(player.getIntArray(), computer.getRandomSetting());
        System.out.println(this); // System.out.println(this)라고 작성된 부분이 스트라이크, 볼 결과를 출력한다는 것을 다른사람이 코드를 보고 직관적으로 이해 할 수 있을까요? 변경해보아요.
    }
    /*
        bringGame 메서드를 보면, ball 인스턴스가 파라미터로 player와 computer의 상태를 받아와서 스트라이크와 볼 결과를 계산하도록 해주고 있어요.
        객체지향프로그래밍은 객체가 다른객체에게 메세지를 통해 요청을 주고 요청에 대한 응답을 받아와요.
        하지만 현재 구조는 ball객체가 요청을 준다기 보다는 다른 객체의 정보를 가져와 사용하고 있죠.
        getter를 아예 사용하지 않을수는 없지만 지양하는 것이 좋아요.
        위 구조를 player, computer, ball 객체가 서로 요청을 주고 응답을 받는 구조로 변경해보아요.
        동시에 getter 사용을 지양하는 것이 좋은 이유는 무엇일까요?

        hint. 객체가 서로 요청을 주고 응답을 받는 구조를 만드는것을 떠올릴 때, 현실세계를 떠올리면 편해요.
            현실 세계에서 player, computer, ball은 어떤 관계를 가지고 있을까요?
            하지만, 객체지향세계는 현실세계의 확장이기 때문에 반드시, 현실세계와 같은 구조를 가져야 하는것은 아닙니다!
     */

    public void playGame() {
        computer.setRandomInteger();
        /*
             이 메서드는 computer 인스턴스가 가지고 있을 정답 숫자 야구공들을 만드는 메서드로 보이네요.
             그런데 setRandomInteger()이라는 네이밍은 다른 사람이 보았을때 메서드가 하는 일을 잘 표현하지 못하고 있어보여요.
             메서드 네이밍은 항상어렵지만, "메서드가 하는 일이 무엇일까?", "어떤 이름이 다른사람이 봤을때 쉽게 이해될까?"
             를 고민하면 좀더 좋은 네이밍을 할 수 있어요.
             메서드가 하는 일을 잘 표현하는 네이밍으로 변경해보아요.
        */
        while (true) { // while문이 종료되는 조건에 true가 들어있군요. while (true)로 되어있는 이유가 있을까요?
            player.convertToArray();
            /*
                일반적으로 메서드, 변수의 네이밍에 자료구조 이름(array, list 등)을 직접적으로 사용하지 않아요.
                또한, convertToArray메서드가 하는 일은 player라는 객체가 해야할 일이라고 느껴지지 않네요.
                이런경우, 객체의 책임과 역할이 잘못 분리된 경우가 있을 수 있는데요.
                이 부분은 우리 프로그램의 구조를 변경하면서 고민해보아요.
            */
            bringGame(); // 이 메서드는 플레이어와 컴퓨터의 볼과 스트라이크를 계산하는 메서드군요. 그런데 bringGame()이라는 네이밍이 이러한 일을 잘표현하고있을까요? 네이밍을 변경해보아요.
            if (ball.getStrike() == 3) {
                System.out.println(endMessage());
                setPlaying(); // 이 메서드는 게임을 더 진행 할지 종료할지를 사용자에게 입력받고 판단하는 메서드군요. 그런데 setPlaying()이라는 네이밍이 이러한 일을 잘 표현하고있을까요?
                break;
            }
            /*
                if문 부분은 depth가 3이군요 수정해봅시다!
                그리고, 55번째 줄을 보면 게임 종료 메세지를 출력해주고 있어요. 그렇다면 이 객체는 숫자야구 게임진행, 사용자 입력, 사용자에게 게임 결과 출력이라는 3가지 역할을 하는 걸까요?
                위에서 이야기한것과 같이 하나의 객체는 하나의 역할만 해야해요.
                노션 링크에 있는 영상을 보면서 mvc 패턴을 공부해봅시다.(프로그램 구현에서 mvc패턴을 적용하라는 것은 아님!)
             */
        }
    }
    /*
        playGame()에 bringGame()메서드와 setPlaying()메서드가 포함되어 있어요.
        보통 코드를 작성할때, 특정 메서드의 내부에서 사용되는 메서드들은 특정 메서드의 아래에 위치시켜요.
        코드를 위에서 아래로 읽기 때문이죠. 노션파일에 첨부한 자바 코드 컨벤션을 공부해봅시다.
     */

    public String endMessage() {
        return "3개의 숫자를 모두 맞히셨습니다! 게임 종료" + "게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요";
        // 이 메서드는 사용자에게 게임 결과를 출력하는 일을 하죠. 과연 숫자야구 게임 진행의 역할을 하는 GamePlay가 해야할 일일까요?
        // 또한 객체 외부에서 호출하는 메서드가 아닌 내부에서 사용하는 메서드는 접근 제한자를 private으로 잠궈주어야 해요.
    }

    public void setPlaying() {
        if (sc.nextInt() == 1) { // if문 안의 조건식을 보면 사용자 입력이 1이면 게임을 다시시작한다는 것을 나타내 주는데요. 이 조건식을 다른사람이 본다면 직관적으로 이해 할 수 있을까요? 직관적으로 이애하기 쉽도록 변경해봅시다.
            playGame();
        } else if (sc.nextInt() == 2) { // 위와 같아요.
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        if (ball.getStrike() == 0 && ball.getBall() == 0) {
            return "낫싱";
        } else {
            return ball.getStrike() + "스트라이크" + ball.getBall() + "볼";
        }
    }
    // 일반적으로 toString()은 디버그를 통해 코드의 문제점을 찾아 낼때 사용해요.
    // 하지만 현재는 결과를 출력하기 위한 용도로 사용하고 있어요.
    // 이를 변경해볼까요? 프로그램 구조를 변경하면서 바뀔 것 같네요. 노션 링크의 mvc 패턴에 대해서 공부해보아요. (mvc 패턴으로 구현하라는 것은 아님)
}
