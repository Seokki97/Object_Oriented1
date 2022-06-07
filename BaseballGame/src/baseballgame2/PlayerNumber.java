package baseballgame2;
import baseballgame.Ball;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.stream.Stream;

public class PlayerNumber {
    private static final int MAX_BALL_SIZE =3;
    private int[] playerNumberToArray = new int[MAX_BALL_SIZE];
    private List<Integer> playerNumber = new ArrayList<>();


    public int[] changeStringToArray() {
        playerNumberToArray = Stream.of(String.valueOf(Input.input()).split(""))
                .mapToInt(Integer::parseInt).toArray();
        return playerNumberToArray;
    }

    public List<Integer> setPersonValue() {
        for (int i = 0; i < 3; i++) {
            playerNumber.add(i, playerNumberToArray[i]);
        }
        return playerNumber;
    }

    }

