package ch18;

public class VipCustomer extends Customer{
    double discount = 0.1;
    double vipPrice;
    public VipCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
    }

   /* public double vipCalcPrice(double price){
        vipPrice = price - (price*discount);
        bonusPoint +=price * bonusRatio;
        return vipPrice;
    } 일케 해도 되고 */
}
