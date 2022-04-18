package ch19;

public class Customer {

    protected int customerId;
    protected String customerName; //protect는 하위 클래스에선 접근 가능하기 때문에 이렇게 설정
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer() call");
    }
    public int calcPrice(int price){
        /*if(customerGrade == "SILVER") {
            bonusPoint += price * bonusRatio;
        }
        else if(customerGrade == "VIP"){
            bonusRatio = 0.05;
            bonusPoint += price * bonusRatio;
        } 이렇게 해도 되는데, 이러면 조건이 늘어날수록 효율성이 떨어진다.*/
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
