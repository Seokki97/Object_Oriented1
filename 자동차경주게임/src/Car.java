public class Car {
    public static final int CAR_START_POSITION =0;
    private final String carName;
    private int carPosition;


    public Car(String carName, int carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public String getCarName() {
        return carName;
    }

    public int move(GameRule gameRule){
        if(gameRule.fowardCarCondition()){
            carPosition++;
        }
        return carPosition;
    }

    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        Car car1 = new Car("pobi",CAR_START_POSITION);
        GameRule gameRule = new GameRule(randomNumber);
       System.out.println(car1.move(gameRule));
    }

}
