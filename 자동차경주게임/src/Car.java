public class Car {
    private final String carName;
    private int carPosition;


    public Car(String carName, int carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }



    public String getCarName() {
        return carName;
    }

    public void move(GameRule gameRule){
        if(gameRule.fowardCarCondition()){
            carPosition++;
        }
    }

}
