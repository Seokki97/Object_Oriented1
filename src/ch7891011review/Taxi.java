package ch7891011review;

public class Taxi {
    int price;
    String taxiName;
    int income;
    int count;

    public Taxi( String taxiName,int price){
        this.taxiName = taxiName;
        this.price = price;
    }

    public void takeTaxi(int income){
        this.income += income;
        count++;
    }

    public void showInfoTaxi(){
        System.out.println(taxiName+"의 승객은" + count +"이고 수입은" +income+"입니다.");
    }
}
