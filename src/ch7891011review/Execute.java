package ch7891011review;

public class Execute {
    public static void main(String[] args) {
    Person edward = new Person(20000, "edward");
    Taxi Taxi1 = new Taxi( "์กฐ์ํ์",10000);

    edward.takeTaxi(Taxi1);
    edward.showPersonInfo();
    Taxi1.showInfoTaxi();

    }
}
