package staticReview;

public class Car {

    private static int carSerialNum = 10000;
    public int carNum;



    public Car(){
        carSerialNum++;
        carNum = carSerialNum;
    }

    public int getCarNum(){
        return carNum;
    }
}
