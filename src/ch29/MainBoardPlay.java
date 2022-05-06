package ch29;

public class MainBoardPlay {
    public static void main(String[] args) {

        Player player = new Player();
        BeginnerLevel bLevel = new BeginnerLevel();
        player.play(1);
        player.upgradeLevel(bLevel);


        AdvancedLevel aLevel = new AdvancedLevel();
        player.play(2);
        player.upgradeLevel(aLevel);


        SuperLevel sLevel = new SuperLevel();
        player.play(3);
        player.upgradeLevel(sLevel);


    }
}
