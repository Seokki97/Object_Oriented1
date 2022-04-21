package ch22;

public class VipCustomer extends Customer {
    double discount = 0.1;

    public VipCustomer(String customerName, int customerId){
        super(customerName,customerId);
        this.customerName = customerName;
        this.customerId = customerId;
        customerGrade = "VIP";
        bonusRatio = 0.05;
    }

    @Override
    public int calcPrice(int price){
        discount = 0.2;
        bonusPoint += price * bonusRatio;
        price -= (int) (price * discount); //소수점일수있으니까 int형으로 명시적형변환
        return price;
    }

}
