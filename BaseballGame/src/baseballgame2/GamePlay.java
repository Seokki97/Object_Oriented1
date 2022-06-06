package baseballgame2;

import java.util.Scanner;

public class GamePlay {
    public static void main(String[] args) {

        BaseballCalculator baseballCalculator = new BaseballCalculator();
        Player player = new Player();
        Computer computer = new Computer();
        System.out.println(baseballCalculator.calculateBall(player, computer));
        System.out.println(baseballCalculator.calculateStrike(player, computer));
    }


}
