import model.Car;
import model.Cars;

public class CarRacingApplication {

    public static void main(String[] args) {

        Car car1 = new Car("pobi");
        Car car2 = new Car("jun");
        Car car3 = new Car("seok");

        Cars cars = new Cars();

        cars.setCarsList(car1);
        cars.setCarsList(car2);
        cars.setCarsList(car3);

        System.out.println(cars.getCarsList());

    }
}
