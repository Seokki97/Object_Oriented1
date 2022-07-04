public class GamePlay {
    private static final int INITIALIZE_POSITIONS_COUNT = 0;
    private final Input input;
    private final RandomNumber randomNumber;
    private GameRule gameRule;
    private final Cars cars;
    private Position position;

    private static final String SCORE_RESULT = "-";


    private Cars showScore() {
        for (int i = 0; i < cars.getPositions().size(); i++) {
            System.out.print(SCORE_RESULT);
        }
        return cars;
    }

    public void showCarsName(Cars cars) {
        for (Car i : cars.getCar12()) {
            System.out.print(i + ":");
            showScore();
            System.out.println();
        }
        System.out.println();
    }

    public GamePlay() {
        randomNumber = new RandomNumber();
        input = new Input();
        gameRule = new GameRule(randomNumber);
        cars = new Cars();
        position = new Position();
    }

    public void playGame() {
        for (int i = 0; i < input.tryNumber; i++) {
            moveCarsPosition();

        }
    }

    public void moveCarsPosition() {

        for (int j = 0; j < cars.getCar12().size(); j++) {
            int i =0;
            randomNumber.makeRandomNumber();
            gameRule = new GameRule(randomNumber);
            position = new Position(position.move(gameRule,i));
            cars.movePosition(position, j);

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
