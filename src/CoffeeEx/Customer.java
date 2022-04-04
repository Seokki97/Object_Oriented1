package CoffeeEx;

public class Customer {
    int money;

    public Customer(int money){
        this.money = money;

    }
    public void orderMenu(Baristar br){
        br.orderCoffee(1500);
        money -=1000;

    }
}
