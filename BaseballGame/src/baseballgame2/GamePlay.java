package baseballgame2;

import java.util.Scanner;

public class GamePlay {
    public static void main(String[] args) {
        Player player = new Player();
        Computer computer = new Computer();
        BaseballCalculator baseballCalculator = new BaseballCalculator();
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        player.setPersonValue(input);
        System.out.println(baseballCalculator.calculateStrike(player, computer));

    }


}
