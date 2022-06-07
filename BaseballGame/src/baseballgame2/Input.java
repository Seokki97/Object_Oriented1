package baseballgame2;

import java.util.Scanner;

public class Input {
    private static String input ;

    public static String inputNumber(){
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        return input;
    }

    public static String input(){
        return input;

    }
}
