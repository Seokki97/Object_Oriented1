package ch06;

public class TravelCustomer {
    //이름 나이 비용
    private String customerName;    private int customerAge;
    private int cost;

    public TravelCustomer(String customerName, int customerAge, int cost){
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.cost = cost;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
