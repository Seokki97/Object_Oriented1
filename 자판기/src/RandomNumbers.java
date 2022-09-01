import java.util.Random;

public class RandomNumbers {
    private Random random = new Random();

    private static final int FIVE_HUNDERED_WON = 500;
    private static final int HUNDRED_WON = 100;
    private static final int FIFTY_WON = 50;
    private static final int TEN_WON = 10;

    private int money10;
    private int money50;
    private int money100;
    private int money500;

    public int makeRandomCoin10(VendingMachine vendingMachine) {
        int a = vendingMachine.getTotalMoney() / TEN_WON;
        if (vendingMachine.getTotalMoney() > TEN_WON) {
            money10 = random.nextInt(a) + 1;
            vendingMachine.setTotalMoney(vendingMachine.getTotalMoney() - (money10 * TEN_WON));
        } else money10 = 0;
        return money10;
    }


    public int makeRandomCoin50(VendingMachine vendingMachine) {
        int a = vendingMachine.getTotalMoney() / FIFTY_WON;
        if (vendingMachine.getTotalMoney() > FIFTY_WON) {
            money50 = random.nextInt(a) + 1;
            vendingMachine.setTotalMoney(vendingMachine.getTotalMoney() - (money50 * FIFTY_WON));
        } else money50 = 0;
        return money50;
    }


    public int makeRandomCoin100(VendingMachine vendingMachine) {
        int a = vendingMachine.getTotalMoney() / HUNDRED_WON;
        if (vendingMachine.getTotalMoney() > HUNDRED_WON) {
            money100 = random.nextInt(a) + 1;
            vendingMachine.setTotalMoney(vendingMachine.getTotalMoney() - (money10 * HUNDRED_WON));
        } else money100 = 0;
        return money100;
    }


    public int makeRandomCoin500(VendingMachine vendingMachine) {
        int a = vendingMachine.getTotalMoney() / FIVE_HUNDERED_WON;
        if (vendingMachine.getTotalMoney() > FIVE_HUNDERED_WON) {
            money500 = random.nextInt(a) + 1;
            vendingMachine.setTotalMoney(vendingMachine.getTotalMoney() - (money500 * FIVE_HUNDERED_WON));
        } else money500 = 0;
        return money500;
    }
}
