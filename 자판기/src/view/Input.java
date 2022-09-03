package view;

import model.Goods;
import model.VendingMachine;

import java.util.Scanner;

public class Input {

    static Scanner input = new Scanner(System.in);


    public static void inputTotalMoney(VendingMachine vendingMachine) {
        vendingMachine.setTotalMoney(input.nextInt());
    }

    public static void inputGoodsInformation(Goods goods){
        String information = Input.input.nextLine();
        String[] informationSplit = information.split(",");
        goods.setGoodsName(informationSplit[0], informationSplit[1], Input.input.nextInt());
    }


}
