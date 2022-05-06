package ch29;

public class Player  {
    int level;

    public void getLevel(){
    }

    public void upgradeLevel(PlayerLevel pl){
        pl.showLevelMessage();
        pl.go(level);
    }

    public void play(int level){
        this.level = level;
        getLevel();


    }


}
