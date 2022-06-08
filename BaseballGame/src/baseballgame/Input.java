package baseballgame;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    private static final int NUMBER_OF_BALLS_COUNT = 3;
    private static String input;

    public static String inputNumber() {
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        if (Arrays.stream(input.split("")).distinct().count() != NUMBER_OF_BALLS_COUNT) {
            throw new IllegalArgumentException("숫자가 중복되었습니다");
        }

        if (input.length() != NUMBER_OF_BALLS_COUNT) {
            throw new IllegalArgumentException("입력된 숫자가 3자리가 아닙니다.");
        }
        return input;
    }

    public static String showInput() {
        return input;
    }
}
