package baseballgame;

import java.util.Arrays;
import java.util.Random;

public class Computer {

    private int[] randomSetting = new int[Ball.SIZE]; //Ball.SIZE는 Ball 객체의 상태이죠. 다른 객체의 상태를 직접 가져와 사용하면 어떤 문제가 있을수 있을까요?
    /*
        배열보다는 Collection Api를 사용해볼까요?
        그리고 randomSetting이라는 네이밍은 Computer가 가지고 있는 정답 난수들이라는것을 잘 표현 해줄까요?
        randomSetting을 바꾸어보아요.
        그리고 배열보다 Collection Api를 사용해야 하는 이유는 무엇일까요?
     */

    public int[] getRandomSetting() {
        return randomSetting;
    }

    public String setRandomInteger() {
        Random rand = new Random(); //rand라는 네이밍과 같이 줄임말을 사용하는것은 지양하는 것이 좋아요

        for (int i = 0; i < 3; i++) {  // for문 내부에서 쓰이는 0, 3, 9, 1 과 같이 메서드에서 사용되는 숫자들을 매직넘버라고 해요. 매직넘버는 우리가 코드를 이해하기 어렵게 하죠. 매직넘버를 상수로 변경해봅시다. 자바 상수에 대해 구글에 검색하여 찾아보아요.
            randomSetting[i] = rand.nextInt(9 - (1) + 1) + (1);
            for (int j = 0; j < i; j++) {
                if (randomSetting[i] == randomSetting[j]) {
                    i--;
                }
            }
        }
        /*
            이중 for문을 제거해봅시다! 또한 depth가 4군요 depth가 2를 넘지 않도록 해보아요.
            그리고 이중 for문은 코드를 이해하기 어렵게해요. 이중 for문이 반드시 필요한 경우도 있지만
            저는 왠만해서는 이중 for문 또는 그이상의 for문은 지양해요.
            이중 for문을 사용하지 않고 코드의 가독성을 높힐 방법을 고민해서 변경해봅시다.
         */
        return Arrays.toString(randomSetting);
    }

}
