package staticReview;

public class Car {

    private static int carSerialNum = 10000;
    public int carNum;
    String carName;


    public Car(String carName){
        this.carName = carName;
    }
    public Car(){
        this("소나타");
        carSerialNum++;
        carNum = carSerialNum;
    }


    public int getCarNum(){
        return carNum;
    }
}
