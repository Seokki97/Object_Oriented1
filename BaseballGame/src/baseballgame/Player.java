package baseballgame;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Player {

    private int[] input ;
    Scanner sc = new Scanner(System.in);
    public String inputNum;

    public int[] getInput() {
        return input;
    }

    public void setInputNum(int[] input) {
        this.input = input;
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

        input = Stream.of(String.valueOf(inputNum).split(""))
                .mapToInt(Integer::parseInt).toArray();

        return Arrays.toString(input);
    }

}
