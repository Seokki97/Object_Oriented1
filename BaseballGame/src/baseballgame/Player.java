package baseballgame;

import java.util.*;
import java.util.stream.Stream;

public class Player {
    private List<Integer> playerNum = new ArrayList<>();
    private Set<Integer> findingDuplication ;

    public String input;
    int[] inputNum;

    public int[] stringToList(){
        inputNum = Stream.of(String.valueOf(input).split(""))
                .mapToInt(Integer::parseInt).toArray(); //[0,1,2]
        return inputNum;
    }

    public void inputLengthException() throws IllegalArgumentException{
        if (input.length() != 3) {
            throw new InputException("입력한 수가 3자리가 아닙니다.");
        }
    }

    public void inputRangeException() throws IllegalArgumentException{
        if (playerNum.stream().allMatch(a -> a>9 || a < 0) ) {
            throw new InputException("입력한 수의 범위가 1~9가 아닙니다.");
        }
    }

    public void inputDuplicateException() throws IllegalArgumentException{
        findingDuplication = new HashSet<>(playerNum);
        if(playerNum.size() != findingDuplication.size()){
            throw new InputException("중복된 수를 입력하였습니다.");
        }
    }

    public void setPersonValue() {
        for (int i = 0; i < Ball.MAX_SIZE; i++) {
            playerNum.add(i, inputNum[i]);
        }
    }

    public List<Integer> getPersonValue() {
        return playerNum;
    }
}
