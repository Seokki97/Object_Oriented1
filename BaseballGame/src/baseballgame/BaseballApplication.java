package baseballgame;

public class BaseballApplication {
    public static void main(String[] args) {
        GamePlay gameplay = new GamePlay();

        while (true) {
                gameplay.playGame();
                System.out.println(gameplay.showEndMessage());
                gameplay.restartOrEndGame();
        }
    }
}
