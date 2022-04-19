package ch19;

public class VipCustomer extends Customer {
    double discount = 0.1;
    double vipPrice;
  /*  public VipCustomer(){
        super(0,"noname");
        customerGrade = "VIP";
        bonusRatio = 0.05;
        System.out.println("VIPCustomer() call"); //Customer 먼저 불리고 그다음 vipcustomer가 불린다
    }*/

    public VipCustomer(int customerId, String customerName){
        super(customerId,customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        System.out.println("VIPCustomer() call");
    }

    public double vipCalcPrice(double price){
        vipPrice = price - (price*discount);
        bonusPoint +=price * bonusRatio;
        return vipPrice;
    }
}
