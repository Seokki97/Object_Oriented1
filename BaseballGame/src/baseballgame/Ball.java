package baseballgame;

public class Ball {
    final int INITIAL_NUM = -1;
    static final int SIZE = 3;
    int strike;
    int ball;
    String nothing = "낫싱";

    public String makeStrike(int[] a1, int[] a2) {
        strike = 0;
        for (int i = 0; i < 3; i++) {
            if (a1[i] == a2[i]) {
                strike++;
                a1[i] = INITIAL_NUM;
            }
        }
        return strike + "스트라이크";
    }

    public String makeBall(int[] a1, int[] a2) {
        ball = 0;
        for (int i = 0; i < 3; i++) { //0 12 1 0 3 2 01
            for (int j = 0; j < 3; j++) {
                if (a1[i] == a2[j]) {
                    ball++;
                }
            }
        }
        return ball + "볼";
    }

    public String makeNothing(int[] a1, int[] a2) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a1[i] != a2[i]) {

                    return nothing;
                }
            }
        }
        return null;
    }

}
