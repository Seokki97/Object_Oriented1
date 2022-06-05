package baseballgame2;

import java.util.ArrayList;
import java.util.List;
public class Computer {
    public List<Integer> computerNumber = new ArrayList<>();

    public Computer(){

    }
    public List<Integer> makeComputerNumber(RandomNumber randomNumber){
        computerNumber = randomNumber.makeRandomNumber(computerNumber);

        return computerNumber;
    }

}
