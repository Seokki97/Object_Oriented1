package baseballgame2;
import java.util.Scanner;
import java.util.stream.Stream;

public class PlayerNumber {
    public int[] PlayerNumberToArray = new int[3];

    public int[] changeStringToArray(String PlayerNumberInput) {
        PlayerNumberToArray = Stream.of(String.valueOf(PlayerNumberInput).split(""))
                .mapToInt(Integer::parseInt).toArray(); //[0,1,2]
        return PlayerNumberToArray;
    }

    }

