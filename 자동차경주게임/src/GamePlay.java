public class GamePlay {
    Input input;
    RandomNumber randomNumber;
    Car car;
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
        position.setPosition(cars);
        GameMessage.showTryNumberMessage();
        input.inputMoveNumber();
        while(i < 5){
            position.move(gameRule);
            i++;
        }
        System.out.println(cars.getCar12());
        System.out.println(position.getPositions().toString());
    }

    public void RacingCalculator(){

    }
    public static void main(String[] args) {
        GamePlay gameplay = new GamePlay();
        gameplay.playGame();
    }

}
