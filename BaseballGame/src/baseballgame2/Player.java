package baseballgame2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private final int MAX_NUMBER_LENGTH = 3;
    public List<Integer> playerNumber = new ArrayList<>();
    String inputNumber;


    public List<Integer> setPersonValue(PlayerNumber playerNumber2) {
        playerNumber2.changeStringToArray(inputNumber);
        for (int i = 0; i < MAX_NUMBER_LENGTH; i++) {
            playerNumber.add(i,playerNumber2.PlayerNumberToArray[i]);
        }
        return playerNumber;
    }

}
