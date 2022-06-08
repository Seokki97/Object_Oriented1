package baseballgame;

public class GamePlay {
    private static final int SYSTEM_OUT = 0;

    private PlayerNumber playerNumber = new PlayerNumber();
    private RandomNumber randomNumber = new RandomNumber();

    private BaseballCalculator baseballCalculator = new BaseballCalculator();
    private GameMessageCalculator gameMessageCalculator = new GameMessageCalculator();

    private void InputRetryOrEnd() {
        if (Input.showRetryOrEndNumber().equals(Input.RESTART_GAME)) {
            baseballCalculator.initializeStrike();
            baseballCalculator.initializeBall();
            playGames();
        }
        if (Input.showInput().equals(Input.END_GAME))
            System.exit(SYSTEM_OUT);
    }

    public void playGames() {
        randomNumber.makeRandomNumber();

        while (gameMessageCalculator.endGame(baseballCalculator)) {
            Input.inputNumber();

            playerNumber.changeStringToArray();
            playerNumber.changeArrayToListPlayerNumber();

            baseballCalculator.calculateStrike(playerNumber, randomNumber);
            baseballCalculator.calculateBall(playerNumber, randomNumber);

            playerNumber.getPlayerNumber().clear();

            gameMessageCalculator.showNothingMessage(baseballCalculator);
            gameMessageCalculator.showStrikeMessage(baseballCalculator);
            gameMessageCalculator.showBallMessage(baseballCalculator);
        }
        Input.inputRetryOrEndNumber();
        InputRetryOrEnd();
    }
}
