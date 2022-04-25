package ch24;

public class CarTest {
    public static void main(String[] args) {

        Car aiCar = new AICar();

        aiCar.run();

        Car mCar = new ManualCar();
        mCar.run();
    }
}
