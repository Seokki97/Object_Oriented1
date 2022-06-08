package baseballgame;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static final String RESTART_GAME = "1";
    public static final String END_GAME = "2";
    private static final int NUMBER_OF_BALLS_COUNT = 3;

    private static String inputPlayerNumber;
    private static String inputRetryOrEndNumber;
    private static Scanner scanner = new Scanner(System.in);

    public static String inputNumber() {
        inputPlayerNumber = scanner.nextLine();

        if (Arrays.stream(inputPlayerNumber.split("")).distinct().count() != NUMBER_OF_BALLS_COUNT) {
            throw new IllegalArgumentException("숫자가 중복되었습니다");
        }

        if (inputPlayerNumber.length() != NUMBER_OF_BALLS_COUNT) {
            throw new IllegalArgumentException("입력된 숫자가 3자리가 아닙니다.");
        }
        return inputPlayerNumber;
    }

    public static String showInput() {
        return inputPlayerNumber;
    }

    public static String inputRetryOrEndNumber() {
        inputRetryOrEndNumber = scanner.nextLine();

        if (inputRetryOrEndNumber.equals(RESTART_GAME) || inputRetryOrEndNumber.equals(END_GAME)) {
            return inputRetryOrEndNumber;
        } else {
            throw new IllegalArgumentException("입력된 숫자가 1 또는 2가 아닙니다");
        }
    }

    public static String showRetryOrEndNumber() {
        return inputRetryOrEndNumber;
    }
}
