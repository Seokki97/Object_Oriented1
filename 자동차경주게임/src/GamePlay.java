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

    public void makeCar(){
        for(String str : input.carName){
          new Car(str,Car.CAR_START_POSITION);
        }
    }

}
