package ch11;

public class Transportation {
    int personCount;
    int income;
    String transportationName;
    int transportationNumber;
    int price;
    Person ps = new Person();

    public Transportation(){}

    public Transportation(String transportationName, int transportationNumber,
                           int income, int personCount,int price){
        this.transportationName = transportationName;
        this.transportationNumber = transportationNumber;
        this.income = income;
        this.personCount = personCount;
        this.price = price;
    }
    public void transportType(){

    }

    public void ShowTpInfo(){

    }
}
