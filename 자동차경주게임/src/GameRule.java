public class GameRule {
    private static final int FOWARD_CAR_CONDITION = 4;
    private static final String SCORE_RESULT = "-";
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

    public void showScore(Position position) {
        for (int i = 0; i < position.getPosition(); i++) {
            System.out.print(SCORE_RESULT);
        }
    }

    public void showWinner(Position position){
        
    }


}
