package baseballgame2;
import baseballgame.Ball;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.stream.Stream;

public class PlayerNumber {
    private int[] playerNumberToArray = new int[3];
    public List<Integer> playerNumber = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    private int[] changeStringToArray() {
        String input = sc.nextLine();
        playerNumberToArray = Stream.of(String.valueOf(input).split(""))
                .mapToInt(Integer::parseInt).toArray();
        return playerNumberToArray;
    }

    public List<Integer> setPersonValue() {
        changeStringToArray();

        for (int i = 0; i < 3; i++) {
            playerNumber.add(i, playerNumberToArray[i]);
        }
        return playerNumber;
    }

    public static void main(String[] args) {
        PlayerNumber p1 = new PlayerNumber();
        System.out.println(p1.setPersonValue().toString());
    }
    }

