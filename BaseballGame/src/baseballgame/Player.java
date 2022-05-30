package baseballgame;

import java.util.*;
import java.util.stream.Stream;

public class Player {
    private List<Integer> person = new ArrayList<>();

    private Set<Integer> numSet ;

    public void setPersonValue(int input) {

        int[] inputNum = Stream.of(String.valueOf(input).split(""))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < Ball.MAX_SIZE; i++) {
            getPerson().add(i, inputNum[i]);

        }
    }

    public void inputLengthException() throws IllegalArgumentException{
        if (person.size() != 3) {
            throw new InputException("입력한 수가 3자리가 아닙니다.");
        }
    }

    public void inputRangeException() throws IllegalArgumentException{
        if (person.stream().allMatch(a -> a>9 || a < 0) ) {
            throw new InputException("입력한 수의 범위가 1~9가 아닙니다.");
        }
    }

    public void inputDuplicateException() throws IllegalArgumentException{
        numSet = new HashSet<>(person);
        if(person.size() != numSet.size()){
            throw new InputException("중복된 수를 입력하였습니다.");
        }
    }


    public List<Integer> getPerson() {
        return person;
    }
}
