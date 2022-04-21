package ch22;

public class GoldCustomer extends Customer{

    public GoldCustomer(String customerName, int customerId){
        super(customerName,customerId);
        customerGrade = "Gold";
        bonusRatio = 0.02;
    }

    @Override
    public int calcPrice(int price){
        discount = 0.05;
        bonusPoint += price * bonusRatio;
        price -= (int) (price * discount); //소수점일수있으니까 int형으로 명시적형변환
        return price;
    }
}
