package baseballgame;

import java.util.Arrays;
import java.util.Scanner;

public class Player {

    private String[] input ;
    Scanner sc = new Scanner(System.in);
    public String inputNum;

    public String[] getInput() {
        return input;
    }

    public void setInputNum(String[] input) {
        this.input = input;
    }
    public void exception() throws IllegalArgumentException{
        inputNum = sc.nextLine();

        if(inputNum == null){
            throw new InputException("null");
        }
        if(inputNum.length() >3){
            throw new InputException("3초과");
        }
        if(inputNum.matches("[1-9]"));
    }

    public String stringToArray()  {
            try {
                exception();
            }catch (InputException e){
                System.out.println(e);
            }
        input = inputNum.split("");
        return Arrays.toString(input);
    }

    public static void main(String[] args) {
        Player p1 = new Player();
        System.out.println(p1.stringToArray());

    }
}
