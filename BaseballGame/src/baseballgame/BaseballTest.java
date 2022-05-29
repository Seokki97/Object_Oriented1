package baseballgame;

public class BaseballTest {

    public static void main(String[] args) {

        GamePlay player1 = new GamePlay();
        try {
            player1.playGame();
        } catch (InputException e){
            System.out.println(e);
        }
    }
}
