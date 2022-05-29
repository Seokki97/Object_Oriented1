package baseballgame;

import java.util.*;
import java.util.stream.Stream;

public class Player {
    Scanner sc = new Scanner(System.in);
    private int[] intArray = new int[Ball.SIZE];
    public String clientInput;

    public int[] getIntArray() {
        return intArray;
    }

    public void exception() throws IllegalArgumentException {
        if (clientInput.length() != 3) {
            throw new InputException("잘못입력");
        }
        if (clientInput.matches("[1-9]")) {
            throw new InputException("잘못입력");
        }
        for(int i =0; i<clientInput.length(); i++){
        if(clientInput.indexOf(clientInput.charAt(i)) == i){
            throw new InputException("잘못 입력");
            }
        }

    }

    public String stringToArray() {
        clientInput = sc.nextLine();
        exception();
        intArray = Stream.of(String.valueOf(clientInput).split(""))
                .mapToInt(Integer::parseInt).toArray();

        return Arrays.toString(intArray);
    }

}
