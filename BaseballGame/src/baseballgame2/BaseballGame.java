package baseballgame2;

import java.util.List;

public class BaseballGame {
    public RandomNumber randomNumbers;
    public PlayerNumber playerNumbers;

    BaseballCalculator baseballCalculator = new BaseballCalculator();
    public BaseballGame(List<Integer> playerNumber, List<Integer> computerNumber){
        playerNumbers = new PlayerNumber(playerNumber);
        randomNumbers = new RandomNumber(computerNumber);
    }

    public int getStrikeCount(){
        return baseballCalculator.calculateStrike(playerNumbers,randomNumbers);
    }
    public long getBallCount(){
        return baseballCalculator.calculateBall(playerNumbers,randomNumbers);
    }


}
