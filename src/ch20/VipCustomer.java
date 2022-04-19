package ch20;

public class VipCustomer extends Customer {
    double discount = 0.1;
    double vipPrice;
    public VipCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
    }

    /*public double vipCalcPrice(double price){
        vipPrice = price - (price*discount);
        bonusPoint +=price * bonusRatio;
        return vipPrice;
    }*/
    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        price -= (int) (price * discount); //소수점일수있으니까 int형으로 명시적형변환
        return price;
    }

}
