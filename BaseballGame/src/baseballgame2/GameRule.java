package baseballgame2;


public class GameRule {
    private static final int GAME_END_CONDITION =3;

    public void endGameCondition(int strike){
        if(strike == GAME_END_CONDITION){
            GameMessage.showEndGameMessage();
        }

    }
}
