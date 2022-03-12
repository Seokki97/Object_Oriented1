package ch040506review;


public class foodDelivery {
 long number;
 int phoneNumber;
 String address;
 int day;
 int time;
 int price;
 int menuNumber;

 public foodDelivery(){
 }

 public foodDelivery(long number, int phoneNumber, String address, int day, int time, int price, int menuNumber){
     this.number = number;
     this.phoneNumber = phoneNumber;
     this.address = address;
     this.day = day;
     this.time = time;
     this.price = price;
     this.menuNumber = menuNumber;
 }

    public String deliveryInfo(){
        return "접수번호:" +this.number + "휴대폰번호" +this.phoneNumber +"주소:" + this.address
                + "주문날짜:" + this.day + "주문시간:" + this.time + "가격:" + this.price +"접수번호:" +
                this.menuNumber;
    }
}
