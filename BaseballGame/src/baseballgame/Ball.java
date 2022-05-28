package baseballgame;

public class Ball {
  final int INITIAL_NUM = -1;
  int strike =0;
  int ball = 0;
  String nothing = "낫싱";

  public int makeStrike(int[] a1, int[] a2) {

    for (int i = 0; i < 3; i++) {
      if (a1[i] == a2[i]) {
        strike++;
        a2[i] = INITIAL_NUM;
      }
    }
    return strike;
  }

  public int makeBall(int[] a1, int[] a2) {

    for (int i = 0; i < 3; i++) { //0 12 1 0 3 2 01
      for (int j = 0; j < 3; j++) {
        if (a1[i] == a2[i]) {
          ball++;
        }
      }
    }
    return ball;
  }

  public String makeNothing(int[] a1, int[] a2) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (a1[i] != a2[i]) {

        }
      }
    }
    return nothing;
  }

  @Override
  public String toString(){
    return strike+"스트라이크" +ball +"볼" +nothing;
  }
}
