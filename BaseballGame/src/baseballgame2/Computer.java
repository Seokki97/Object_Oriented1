package baseballgame2;

import java.util.ArrayList;
import java.util.List;
public class Computer {
    private List<Integer> computerNumber = new ArrayList<>();

    public Computer(){}
    public Computer(List<Integer> computerNumber){
        this.computerNumber = computerNumber;

    }
    public List<Integer> makeComputerNumber(){
        RandomNumber randomNumber = new RandomNumber();

        computerNumber = randomNumber.computerNumber1;
        return computerNumber;
    }

}
