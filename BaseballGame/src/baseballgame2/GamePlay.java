package baseballgame2;;

public class GamePlay {
    PlayerNumber player = new PlayerNumber();
    RandomNumber computer = new RandomNumber();

    BaseballCalculator baseballCalculator = new BaseballCalculator();
    BaseballGame baseballGame = new BaseballGame();

    public void playGames() {
        computer.makeRandomNumber();

        do {
            Input.inputNumber();
            System.out.println(computer.getRandomNumber());
            player.changeStringToArray();
            player.setPersonValue();

            baseballCalculator.calculateStrike(player, computer);
            baseballCalculator.calculateBall(player, computer);

            baseballGame.showStrikeAndBall(baseballCalculator);
            baseballGame.showNothingMessage(baseballCalculator);
        } while (baseballGame.endGame(baseballCalculator));
    }


}
