package baseballgame2;

public class BaseballGame {

    public void showStrikeAndBall(BaseballCalculator baseballCalculator){
        if(baseballCalculator.getStrikeCount()<3){
            GameMessage.showScore(baseballCalculator.getStrikeCount(), baseballCalculator.getBallCount());
            baseballCalculator.initializeStrikeCount(0,0);
        }
    }

    public void showNothingMessage(BaseballCalculator baseballCalculator){
        if(baseballCalculator.getStrikeCount() ==0 && baseballCalculator.getBallCount()==0){
            GameMessage.showNothing();
        }
    }
    public boolean endGame(BaseballCalculator baseballCalculator){
        if(baseballCalculator.getStrikeCount() == 3){
            GameMessage.showEndGameMessage();
            GameMessage.showRetryMessage();
            return false;
        }
        return true;

    }

}
