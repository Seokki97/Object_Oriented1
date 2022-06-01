package baseballgame;

import java.util.Scanner;

public class BaseballTest {
    public static void main(String[] args) {
        Player player = new Player();
        GamePlay PlayingGame = new GamePlay();
        Computer computer = new Computer();
        Scanner sc = new Scanner(System.in);
        GameComplete gameComplete = new GameComplete();



        PlayingGame.playGame();
        }
}
