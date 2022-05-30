package baseballgame;

public class Ball {
    final int INITIAL_NUM = -1;
    static final int SIZE = 3;
    private int strike;
    private int ball;
    /*
        필드(상태)의 접근제한자가 각기 다르군요.
        이러면 어떤문제가 있을까요?
        변경해봅시다. 또한, 객체의 캡슐화란 무엇일까요?
     */

    public int getStrike() { // 일반적으로 getter는 클래스의 제일 하단에 작성해요. (오버라이드한 메서드보다는 상단에 작성합니다!)
        return strike;
    }

    public int getBall() { // 일반적으로 getter는 클래스의 제일 하단에 작성해요. (오버라이드한 메서드보다는 상단에 작성합니다!)
        return ball;
    }

    public String makeStrike(int[] a1, int[] a2) { // 파라미터 네이밍이 a1, a2군요. 이 메서드의 파라미터가 무엇인지 직관적으로 알수 있을까요? 변경해봅시다.
        strike = 0;
        for (int i = 0; i < 3; i++) {
            if (a1[i] == a2[i]) {
                strike++;
                a1[i] = INITIAL_NUM;
            }
        }
        return strike + "스트라이크";
    }
    /*
        for문의 depth가 3이예요. 변경해봅시다.
        또한 매직넘버를 제거해봅시다.
        그리고 현재 구조에서 Ball 객체는 스트라이크와 볼의 개수를 판단하는 역할을 하는 것으로 보이는데,
        return 문에서는 strike + "스트라이크"를 리턴해줌으로써 출력형식을 지정해주고있죠.
        출력형식을 지정해주는 것이 Ball 객체의 역할이 맞을까요?
     */

    public String makeBall(int[] a1, int[] a2) {
        ball = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a1[i] == a2[j]) {
                    ball++;
                }
            }
        }
        return ball + "볼";
    }
    /*
        for문의 depth가 4예요. 변경해봅시다.
        또한 매직넘버를 제거해봅시다.
        그리고 현재 구조에서 Ball 객체는 스트라이크와 볼의 개수를 판단하는 역할을 하는 것으로 보이는데,
        return 문에서는 strike + "스트라이크"를 리턴해줌으로써 출력형식을 지정해주고있죠.
        출력형식을 지정해주는 것이 Ball 객체의 역할이 맞을까요?
     */

}
