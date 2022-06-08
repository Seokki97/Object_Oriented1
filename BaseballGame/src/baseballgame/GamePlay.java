package baseballgame;

public class GamePlay {
    private static final String RESTART_GAME = "1";
    private static final String END_GAME = "2";
    private static final int SYSTEM_OUT = 0;

    private PlayerNumber player = new PlayerNumber();
    private RandomNumber randomNumber = new RandomNumber();

    private BaseballCalculator baseballCalculator = new BaseballCalculator();
    private GameMessageCalculator baseballGame = new GameMessageCalculator();

    public void playGames() {
        randomNumber.makeRandomNumber();

        while (baseballGame.endGame(baseballCalculator)) {
            Input.inputNumber();
            System.out.println(randomNumber.getRandomNumber());

            player.changeStringToArray();
            player.setPersonValue();
            baseballCalculator.calculateStrike(player, randomNumber);
            baseballCalculator.calculateBall(player, randomNumber);

            player.getPlayerNumber().clear();

            baseballGame.showNothingMessage(baseballCalculator);
            baseballGame.showStrikeMessage(baseballCalculator);
            baseballGame.showBallMessage(baseballCalculator);
        }
        Input.inputNumber();
        InputRetryOrEnd();
    }

    public void InputRetryOrEnd() {
        if (Input.showInput().equals(RESTART_GAME)) {
            baseballCalculator.initializeStrike();
            baseballCalculator.initializeBall();
            playGames();
        }
        if (Input.showInput().equals(END_GAME))
            System.exit(SYSTEM_OUT);
    }
}
