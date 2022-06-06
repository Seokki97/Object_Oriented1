package baseballgame2;

import java.util.List;

public class BaseballGame {
    public RandomNumber randomNumbers;
    public PlayerNumber playerNumbers;

    BaseballCalculator baseballCalculator = new BaseballCalculator();

    public int getStrikeCount(){
        return baseballCalculator.calculateStrike(playerNumbers,randomNumbers);
    }
    public long getBallCount(){
        return baseballCalculator.calculateBall(playerNumbers,randomNumbers);
    }

    public void showStrikeAndBall(){
        if(getStrikeCount()<3){
            GameMessage.showScore(getStrikeCount(),getBallCount());
        }
    }
    public void showNothingMessage(){
        if(getStrikeCount() ==0 && getBallCount() ==0){
            GameMessage.showNothing();
        }
    }
    public boolean endGame(){
        if(getStrikeCount() == 3){
            GameMessage.showEndGameMessage();
            GameMessage.showRetryMessage();
            return false;
        }
        return true;

    }

    public void GamePlay(){
        randomNumbers.makeRandomNumber();
        while(endGame()){
            playerNumbers.setPersonValue();

            baseballCalculator.calculateStrike(playerNumbers,randomNumbers);
            baseballCalculator.calculateBall(playerNumbers,randomNumbers);
            showStrikeAndBall();
            showNothingMessage();
        }
    }

}
