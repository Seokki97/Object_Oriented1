package input;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);


    public static int inputTryingNumber(){
         return scanner.nextInt();
    }

    public static String inputCarNames(){
        String carNames = scanner.nextLine();
        return carNames;
    }
}
