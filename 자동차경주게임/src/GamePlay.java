public class GamePlay {
    Input input;
    RandomNumber randomNumber;
    Car car;
    GameRule gameRule;
    public GamePlay(){
        randomNumber = new RandomNumber();
        input = new Input();
        gameRule = new GameRule(randomNumber);
    }
    public void setCarName(){
        input.inputCarName();
    }

    public Car makeCar(){
        return new Car("!@3");
    }

    public void playGame(){
        GameMessage.showInputCarNameMessage();
        setCarName();
        makeCar();
        GameMessage.showTryNumberMessage();
        input.inputMoveNumber();
        do{
            GameMessage.showResultMessage();
            gameRule.fowardCarCondition();
            System.out.println(car);
        }while(true);
    }

    public static void main(String[] args) {
        GamePlay gamePlay = new GamePlay();
        gamePlay.playGame();
    }
}
