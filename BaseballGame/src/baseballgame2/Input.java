package baseballgame2;

import java.util.Scanner;

public class Input {
    private static String input ;

    public static String inputNumber(){
        Scanner scanner = new Scanner(System.in);
        try {
            input = scanner.nextLine();
        } throw new IllegalArgumentException()
        return input;
    }

    public static String showInput(){
        return input;
    }
}
