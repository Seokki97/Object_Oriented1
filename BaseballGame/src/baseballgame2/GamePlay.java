package baseballgame2;

;

public class GamePlay {
    PlayerNumber player = new PlayerNumber();
    RandomNumber computer = new RandomNumber();

    BaseballCalculator baseballCalculator = new BaseballCalculator();
    BaseballGame baseballGame = new BaseballGame();

    public void playGames() {
        computer.makeRandomNumber();

        while (baseballGame.endGame(baseballCalculator)) {
            Input.inputNumber();
            System.out.println(computer.getRandomNumber());

            player.changeStringToArray();
            player.setPersonValue();
            baseballCalculator.calculateStrike(player, computer);
            baseballCalculator.calculateBall(player, computer);

            player.getplayerNumber().clear();

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
