package baseballgame;

public class GameMessage {
    public static void showStrikeScore(int strike) {
        System.out.print(strike + "스트라이크 ");
    }

    public static void showBallScore(long ball) {
        System.out.println(ball + "볼");
    }

    public static void showNothing() {
        System.out.println("낫싱");
    }

    public static void showRetryMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void showEndGameMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}
