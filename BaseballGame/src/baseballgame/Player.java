package baseballgame;

import java.util.*;
import java.util.stream.Stream;

public class Player {
    Scanner sc = new Scanner(System.in); // Player 객체도 사용자 입력을 받는 Scanner 객체를 상태로 가지고 있군요. GamePlay와 중복이 되고있어요. 동시에, Player는 게임 참가자라는 역할과 사용자 입력을 받는 역할 두가지 역할을 하고 있죠. 하나의 역할만 하도록 변경해보아요.
    private int[] intArray = new int[Ball.SIZE];//Ball.SIZE는 Ball 객체의 상태이죠. 다른 객체의 상태를 직접 가져와 사용하면 어떤 문제가 있을수 있을까요?
    private List<Integer> person = new ArrayList<>();
    public String clientInput; // sc에 작성한 피드백과 같아요.

    List<String> list ; // 일반적으로 자료구조의 이름을 변수, 함수명에 직접 사용하지 않아요 동시에 list라는 이름이 무슨일을 하는지 잘 표현하고 있을까요? 변경해보아요.
    Set<String> numSet ; // 일반적으로 자료구조의 이름을 변수, 함수명에 직접 사용하지 않아요 동시에 numSet라는 이름이 무슨일을 하는지 잘 표현하고 있을까요? 변경해보아요.
    /*
        변수들의 접근 제한자가 각각 다르게 되어있어요! 이러면 어떤 문제가 있을까요?
        변경해보아요.
     */


    public void inputLengthException() throws IllegalArgumentException{
        if (clientInput.length() != 3) {
            throw new InputException("입력한 수가 3자리가 아닙니다.");
        }
    }

    public void inputRangeException() throws IllegalArgumentException{
        if (clientInput.matches("[1-9]")) {
            throw new InputException("입력한 수의 범위가 1~9가 아닙니다.");
        }
    }

    public void inputDuplicateException() throws IllegalArgumentException{
        list =Arrays.asList(clientInput.split(""));
        numSet = new HashSet<>(list);
        if(list.size() != numSet.size()){
            throw new InputException("중복된 수를 입력하였습니다.");
        }
    }

    public String convertToArray() {
        clientInput = sc.nextLine();

        inputLengthException();
        inputRangeException();
        inputDuplicateException();

        intArray = Stream.of(String.valueOf(clientInput).split(""))
                .mapToInt(Integer::parseInt).toArray();

        return Arrays.toString(intArray);
    }
    /*
        사용자 입력을 배열로 변경해주는 것이 게임 참가자인 Player의 책임이 맞을까요?
     */
    public int[] getIntArray() {
        return intArray;
    }

    public List<Integer> getPerson() {
        return person;
    }
}
