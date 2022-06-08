package baseballgame2;

public class GamePlay {
    private static final String RESTART_GAME = "1";
    private static final String END_GAME = "2";
    private static final int SYSTEM_OUT = 0;

    PlayerNumber player = new PlayerNumber();
    RandomNumber randomNumber = new RandomNumber();

    BaseballCalculator baseballCalculator = new BaseballCalculator();
    GameMessageCalculator baseballGame = new GameMessageCalculator();

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
