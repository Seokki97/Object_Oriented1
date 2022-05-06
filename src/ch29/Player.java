package ch29;

public class Player  {
    int level;

    public void getLevel(){
        if(level ==1) {
            System.out.println("***** 초급자 레벨입니다. *****");
        }
        else if(level==2){
            System.out.println("***** 중급자 레벨입니다. ******");
        }
        else if(level==3){
            System.out.println("***** 고급자 레벨입니다. ******");
        }
    }

    public void upgradeLevel(PlayerLevel pl){
        pl.go(level);

    }

    public void play(int level){
        this.level = level;
        getLevel();

    }


}
