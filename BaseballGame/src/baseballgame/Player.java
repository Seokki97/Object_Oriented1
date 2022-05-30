package baseballgame;

import java.util.*;
import java.util.stream.Stream;

public class Player {
    private List<Integer> person = new ArrayList<>();

    private Set<Integer> numSet ; // 일반적으로 자료구조의 이름을 변수, 함수명에 직접 사용하지 않아요 동시에 numSet라는 이름이 무슨일을 하는지 잘 표현하고 있을까요? 변경해보아요.
    /*
        변수들의 접근 제한자가 각각 다르게 되어있어요! 이러면 어떤 문제가 있을까요?
        변경해보아요.
     */

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
