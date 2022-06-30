public class GamePlay {
    private static final int INITIALIZE_POSITIONS_COUNT = 0;
    private final Input input;
    private final RandomNumber randomNumber;
    private GameRule gameRule;
    private final Cars cars;
    private Position position;

    public GamePlay() {
        randomNumber = new RandomNumber();
        input = new Input();
        gameRule = new GameRule(randomNumber);
        cars = new Cars();
        position = new Position();
    }
    public void playGame() {
        for (int i = 0; i < input.tryNumber; i++) {
            moveCarsPosition(i);
            position = new Position(INITIALIZE_POSITIONS_COUNT); //초기화

        }
    }
    public void moveCarsPosition(int i){

        for (int j = 0; j < cars.getPositions().size(); j++) {
            randomNumber.makeRandomNumber();
            gameRule = new GameRule(randomNumber);
            position = new Position(position.move(gameRule));

            cars.movePosition(position, i);

            System.out.println(gameRule.getRandomNumber());
            System.out.println(cars.getCar12());
            System.out.println(cars.getPositions());
        }

    }

    public void inputCarsList() {
        GameMessage.showInputCarNameMessage();
        cars.inputCarsList(input);
        cars.setPositions(position);
    } //이럼 카 네임을 인풋받고, 그에따른 카리스트, position리스트를 생성함.

    public void inputTryNumber() {
        GameMessage.showTryNumberMessage();
        input.inputMoveNumber();
    }

    public static void main(String[] args) {
        GamePlay gameplay = new GamePlay();
        gameplay.inputCarsList();
        gameplay.inputTryNumber();
        gameplay.playGame();
    }

}
