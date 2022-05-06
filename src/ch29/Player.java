package ch29;

public class Player  {
    int level;

    public void getLevel(){
    System.out.println("***** 초급자 레벨입니다. *****");
    }

    public void upgradeLevel(PlayerLevel pl){
        pl.go(level);

    }

    public int play(int level){

    }


}
