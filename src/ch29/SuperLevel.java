package ch29;

public class SuperLevel extends Player implements PlayerLevel{

    @Override
    public void run() {
        System.out.println("매우 빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump합니다.");
    }

    @Override
    public void turn() {
        System.out.println("turn 합니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급자 레벨입니다. ******");
        go(3);
    }

}
