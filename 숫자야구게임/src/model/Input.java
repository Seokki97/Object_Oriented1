package model;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    public int inputNumberOfGoing(int inputNumber){

        inputNumber = sc.nextInt();

        return inputNumber;
    }

    public String[] inputCarName(String carName){
        carName = sc.nextLine();
        String[] carName1 = carName.split(",");

        return carName1;
    }
}
