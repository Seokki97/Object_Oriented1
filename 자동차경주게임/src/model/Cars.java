package model;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> carsList = new ArrayList<>();


    public List<Car> getCarsList() {
        return carsList;
    }

    public void setCarsList(Car car) {
        carsList.add(car);
    }
}
