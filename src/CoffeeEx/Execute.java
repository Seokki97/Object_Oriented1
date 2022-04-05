package CoffeeEx;

public class Execute {
    public static void main(String[] args) {
        Customer ct1 = new Customer(1500);

        Menu americano = new Menu(1500);
        Menu espresso = new Menu(2500);
        Menu makiyato = new Menu(2500);
        Menu capuchino = new Menu(2000);

        ct1.orderMenu(1500);
    }
}
