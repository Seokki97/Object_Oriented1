package view;

import controller.RandomNumbers;
import model.Goods;
import model.VendingMachine;

public class VendingMachineApplication {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Message.inputMoneyOnMachineMessage();
        Input.inputTotalMoney(vendingMachine);

        Message.showMoneyOnMachineMessage();
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.makeRandomCoin500(vendingMachine);
        randomNumbers.makeRandomCoin100(vendingMachine);
        randomNumbers.makeRandomCoin50(vendingMachine);
        randomNumbers.makeRandomCoin10(vendingMachine);

        System.out.println(randomNumbers.toString());

        Message.showInputGoodsInformation();
        Goods goods = new Goods();
        Input.inputGoodsInformation(goods);

    }
}
