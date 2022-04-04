package CoffeeEx;

public class Baristar {
    int money;
    int count;
    int orderNum;

    public Baristar(int orderNum){
        this.orderNum = orderNum;
    }
    public void orderCoffee(int money){
        this.money += money;

    }
}
