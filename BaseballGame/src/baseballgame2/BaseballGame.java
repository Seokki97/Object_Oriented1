package baseballgame2;

public class BaseballGame {

    public void showStrike(BaseballCalculator baseballCalculator) {
        if (baseballCalculator.getStrikeCount() > 0 && baseballCalculator.getStrikeCount() < 3) {
            GameMessage.showStrikeScore(baseballCalculator.getStrikeCount());
        }
    }

    public void showBall(BaseballCalculator baseballCalculator) {
        if (baseballCalculator.getBallCount() > 0 && baseballCalculator.getBallCount() < 3) {
            GameMessage.showBallScore(baseballCalculator.getBallCount());
        }
    }

    public void showNothingMessage(BaseballCalculator baseballCalculator) {
        if (baseballCalculator.getStrikeCount() == 0 && baseballCalculator.getBallCount() == 0) {
            GameMessage.showNothing();
        }
    }

    public boolean endGame(BaseballCalculator baseballCalculator) {
        if (baseballCalculator.getStrikeCount() == 3) {
            GameMessage.showEndGameMessage();
            GameMessage.showRetryMessage();
            return false;
        }
        return true;

    }

}
