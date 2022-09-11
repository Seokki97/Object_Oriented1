package model;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private static final String ERROR_INVAILD_NAME_LENGTH = "[ERROR] 자동차 이름은 5글자 이하로 설정해 주세요";
    private String carName;

    public Car(String carName){
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }

    private void vaildateNamingLength(String carname){
        if( carname.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException(ERROR_INVAILD_NAME_LENGTH);
        }
    }
}
