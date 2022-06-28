public class GamePlay {
    Input input;
    RandomNumber randomNumber;
    GameRule gameRule;
    Cars cars;
    Position position;
    public GamePlay(){
        randomNumber = new RandomNumber();
        input = new Input();
        gameRule = new GameRule(randomNumber);
        cars = new Cars();
        position = new Position(0);
    }

    public void playGame(){
        int i=0;
        GameMessage.showInputCarNameMessage();
        cars.inputCarsList(input);
        cars.setPositions(position);
        GameMessage.showTryNumberMessage();
        input.inputMoveNumber();
        while(i < 5){
            randomNumber.makeRandomNumber();
            gameRule = new GameRule(randomNumber);
            gameRule.moveCarCondition();
            position.move(gameRule);

            System.out.println(gameRule.getRandomNumber());
            System.out.println(cars.getCar12());
            System.out.println(cars.getPositions());
            i++;
        }

    }
    public static void main(String[] args) {
        GamePlay gameplay = new GamePlay();
        gameplay.playGame();
    }

}
