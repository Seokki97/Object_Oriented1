public class GameRule {
    private static final int FOWARD_CAR_CONDITION = 4;

    private int randomNumber ;

    public GameRule(RandomNumber randomNumber) {
        this.randomNumber = randomNumber.makeRandomNumber();
    }

    // 무작위 값이 4이상일 경우 전진한다

    public boolean moveCarCondition() {
        if (randomNumber >= FOWARD_CAR_CONDITION) {
            return true;
        }
        return false;
    }



}
