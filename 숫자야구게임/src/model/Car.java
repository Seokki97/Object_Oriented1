package model;

public class Car {
    private final String carName;
    private  String carPosition;

    public Car(String carName,String carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public void move(FowardCondition fowardCondition){
        if(fowardCondition.fowardCarCondition()){
            carPosition += "-";
        }
    }



}
