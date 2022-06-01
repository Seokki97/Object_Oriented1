package baseballgame;

import java.util.Scanner;

public class BaseballTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player player = new Player();
        GamePlay PlayingGame = new GamePlay();
        Computer computer = new Computer();

        GameComplete gameComplete = new GameComplete();

        player.setPersonValue();

        PlayingGame.playGame();
        }
}
