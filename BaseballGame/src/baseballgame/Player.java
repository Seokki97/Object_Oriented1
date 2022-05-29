package baseballgame;

import java.util.*;
import java.util.stream.Stream;

public class Player {
    Scanner sc = new Scanner(System.in);
    private int[] intArray = new int[Ball.SIZE];
    public String clientInput;

    List<String> list ;
    Set<String> numSet ;

    public int[] getIntArray() {
        return intArray;
    }

    public void inputException() throws IllegalArgumentException {
        if (clientInput.length() != 3) {
            throw new InputException("잘못입력");
        }
        if (clientInput.matches("[1-9]")) {
            throw new InputException("잘못입력");
        }
        list =Arrays.asList(clientInput.split(""));
        numSet = new HashSet<>(list);
        if(list.size() != numSet.size()){
            throw new InputException("잘못입력");
        }


    }

    public String convertToArray() {
        clientInput = sc.nextLine();
        inputException();
        intArray = Stream.of(String.valueOf(clientInput).split(""))
                .mapToInt(Integer::parseInt).toArray();

        return Arrays.toString(intArray);
    }

}
