package ch20;

public class Customer {

    protected int customerId;
    protected String customerName; //protect는 하위 클래스에선 접근 가능하기 때문에 이렇게 설정
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }
    public int getCustomerId(){

        return customerId;
    }

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    public String getCustomerName(){

        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerGrade(){

        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade){
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은" + customerGrade + "이며 보너스 포인트는" +bonusPoint + "입니다";
    }
}
