import java.util.ArrayList;
import java.util.List;

public class Cars {
    private  List<Car> cars12 = new ArrayList<>();

    public static void main(String[] args) {
        Car car1 = new Car("123");
        Car car2 = new Car("241");

        Cars cars = new Cars();
        cars.cars12.add(car1);
        cars.cars12.add(car2);
        System.out.println(cars.cars12.toString());
    }
}
