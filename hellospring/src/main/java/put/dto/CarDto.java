package put.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarDto {

    private String carName;
    private String carNumber;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @JsonProperty("car_number") //이것도 똑같이 snake 호환문제를 해결해주는 방법
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "carName='" + carName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
