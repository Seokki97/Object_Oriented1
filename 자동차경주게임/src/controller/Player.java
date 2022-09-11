package controller;

import input.Input;

import java.util.Arrays;

public class Player {
    private String[] carNamesArray = new String[3];


    private void splitCarNames(){
       String a =  Input.inputCarNames();
       carNamesArray = a.split(",");
    }

    public String[] getCarNamesArray() {
        return carNamesArray;
    }

    @Override
    public String toString() {
        return "Player{" +
                "carNamesArray=" + Arrays.toString(carNamesArray) +
                '}';
    }

    public static void main(String[] args) {
        Player player = new Player();

        player.splitCarNames();

        System.out.println(player.getCarNamesArray().toString());
    }
}
