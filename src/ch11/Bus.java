package ch11;

public class Bus {
    int busNum;

    int count =0;
    public Bus(int busNum){
        this.busNum = busNum;
    }

    public int takeBus(int price){
        count++;
        return price;
    }
    public void showBusInfo(){
    System.out.println("버스의 승객은" +count + "명 입니ㄷ");
    }
}
/*
public void take(int money) {  //승차
    this.money += money;
    passengerCount++;
}*/