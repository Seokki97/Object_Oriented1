package baseballgame;

public class GamePlay {
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
            //동희형 여기 baseballGame. << 이거 클래스 이름 rename했는데 왜 안바껴도 실행되지? 바꾸면 오류나
            baseballGame.showNothingMessage(baseballCalculator);
            baseballGame.showStrikeMessage(baseballCalculator);
            baseballGame.showBallMessage(baseballCalculator);
        }
        Input.inputRetryOrEndNumber();
        InputRetryOrEnd();
    }

    public void InputRetryOrEnd() {
        if (Input.showRetryOrEndNumber().equals(Input.RESTART_GAME)) {
            baseballCalculator.initializeStrike();
            baseballCalculator.initializeBall();
            playGames();
        }
        if (Input.showInput().equals(Input.END_GAME))
            System.exit(SYSTEM_OUT);
    }
}
