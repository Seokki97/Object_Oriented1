package baseballgame;

public class Ball {

  Computer computer;
  Player player;

  public void bul() {
    computer = new Computer();
    player = new Player();

  }

  public String makeStrike(int[] a1, int[] a2) {

    int count = 0;
    for (int i = 0; i < 3; i++) {
      if (a1[i] == a2[i]) {
        count++;
      }
    }
    return count + "스트라이크";
  }

  public String makeBall(int[] a1, int[] a2) {
    int count = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = i + 1; j < 3; j++) {
        if (a1[i] == a2[i]) {
          count++;
        }
        return count + "볼";
      }
    }
    return "null";
  }

  public String makeNothing(int[] a1, int[] a2) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (a1[i] != a2[i]) {
          return "낫싱";
        }
      }
    }
    return null;
  }

}
