package baseballgame;

public class BaseballTest {

    public static void main(String[] args) {

        GamePlay gp = new GamePlay();
        try {
            gp.doPlaying();
        } catch (InputException e){
            System.out.println(e);
        }
    }
}
