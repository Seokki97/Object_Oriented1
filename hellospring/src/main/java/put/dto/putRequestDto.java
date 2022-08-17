package put.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class) //해당 클래스는 snake케이스로 인식하라고 명시
public class putRequestDto {

    private String name;
    private int age;
    private List<CarDto> carDtoList;

    public List<CarDto> getCarDtoList() {
        return carDtoList;
    }

    public void setCarDtoList(List<CarDto> carDtoList) {
        this.carDtoList = carDtoList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "putRequestDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carDtoList=" + carDtoList +
                '}';
    }
}
