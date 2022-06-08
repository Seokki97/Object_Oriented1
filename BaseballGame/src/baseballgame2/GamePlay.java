package baseballgame2;

public class GamePlay {
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
            baseballGame.showStrike(baseballCalculator);
            baseballGame.showBall(baseballCalculator);
        }
        Input.inputNumber();
        InputRetryOrEnd();
    }

    public void InputRetryOrEnd() {
        if (Input.showInput().equals("1")) {
            baseballCalculator.initializeStrike();
            baseballCalculator.initializeBall();
            playGames();
        }
        if (Input.showInput().equals("2"))
            System.exit(0);
    }
}
