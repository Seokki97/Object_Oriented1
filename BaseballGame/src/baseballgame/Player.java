package baseballgame;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Player {

    private int[] ClientInput ;
    Scanner sc = new Scanner(System.in);
    public String inputNum;

    public int[] getInput() {
        return ClientInput;
    }

    public void exception() throws IllegalArgumentException{

        if(inputNum == null || inputNum.length()>3) {
            throw new InputException("잘못입력");
        }
        if(inputNum.matches("[1-9]")){
            throw new InputException("잘못입력");
        }
    }

    public String stringToArray()  {
        inputNum = sc.nextLine();
            try {
                exception();
            }catch (InputException e){
                System.out.println(e);
            }

        ClientInput = Stream.of(String.valueOf(inputNum).split(""))
                .mapToInt(Integer::parseInt).toArray();

        return Arrays.toString(ClientInput);
    }

}
