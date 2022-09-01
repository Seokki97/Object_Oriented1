package view;

import model.VendingMachine;

import java.util.Scanner;

public class Input {

   static Scanner input = new Scanner(System.in);


   public static void inputTotalMoney(VendingMachine vendingMachine){
       vendingMachine.setTotalMoney(input.nextInt());
   }


}
