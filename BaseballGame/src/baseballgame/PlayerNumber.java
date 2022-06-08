package baseballgame;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PlayerNumber {
    private static final int MAX_BALL_SIZE = 3;
    private static final int MIN_BALL_SIZE = 0;
    private int[] playerNumberToArray = new int[MAX_BALL_SIZE];
    private List<Integer> playerNumber = new ArrayList<>();

    public int[] changeStringToArray() {
        playerNumberToArray = Stream.of(String.valueOf(Input.showInput()).split(""))
                .mapToInt(Integer::parseInt).toArray();
        return playerNumberToArray;
    }

    public List<Integer> changeArrayToListPlayerNumber() {
        for (int index = MIN_BALL_SIZE; index < MAX_BALL_SIZE; index++) {
            playerNumber.add(index, playerNumberToArray[index]);
        }
        return playerNumber;
    }

    public List<Integer> getPlayerNumber() {
        return playerNumber;
    }
}

