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

    public void playGame(){
    }

    public static void main(String[] args) {
    }
}
