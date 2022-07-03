public class GameRule {
    private static final int FOWARD_CAR_CONDITION = 4;
    private int randomNumber;

    public GameRule(RandomNumber randomNumber) {
        this.randomNumber = randomNumber.makeRandomNumber();
    }

    public boolean moveCarCondition() {
        if (randomNumber >= FOWARD_CAR_CONDITION) {
            return true;
        }
        return false;
    }

    public int getRandomNumber() {
        return randomNumber;
    }


    public void showWinner(Position position){

    }


}
