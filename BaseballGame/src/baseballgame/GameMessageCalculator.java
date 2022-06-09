package baseballgame;

public class GameMessageCalculator {
    private static final int MAX_COUNT = 3;
    private static final int MIN_COUNT = 0;

    public void showStrikeMessage(BaseballCalculator baseballCalculator) {
        if (baseballCalculator.getStrikeCount() > MIN_COUNT && baseballCalculator.getStrikeCount() < MAX_COUNT) {
            GameMessage.showStrikeScore(baseballCalculator.getStrikeCount());
        }
    }

    public void showBallMessage(BaseballCalculator baseballCalculator) {
        if (baseballCalculator.getBallCount() > MIN_COUNT && baseballCalculator.getBallCount() < MAX_COUNT) {
            GameMessage.showBallScore(baseballCalculator.getBallCount());
        }
    }

    public void showNothingMessage(BaseballCalculator baseballCalculator) {
        if (baseballCalculator.getStrikeCount() == MIN_COUNT && baseballCalculator.getBallCount() == MIN_COUNT) {
            GameMessage.showNothing();
        }
    }

    public boolean endGame(BaseballCalculator baseballCalculator) {
        if (baseballCalculator.getStrikeCount() == MAX_COUNT) {
            GameMessage.showEndGameMessage();
            GameMessage.showRetryMessage();
            return false;
        }
        return true;

    }

}
