public class GamePlay {
    Input input;
    RandomNumber randomNumber;
    GameRule gameRule;
    Cars cars;
    Position position;

    public GamePlay() {
        randomNumber = new RandomNumber();
        input = new Input();
        gameRule = new GameRule(randomNumber);
        cars = new Cars();
        position = new Position();
    }
    //각 car에따라 다른 moveCarRule이 필요함.
    // add으로 position리스트를 늘리는게 아니라 인덱스로 변화를 줘야함
    public void asd(){

        for(int i = 0; i < input.tryNumber ; i++){
            randomNumber.makeRandomNumber();
            gameRule.moveCarCondition();

            gameRule = new GameRule(randomNumber);
            position = new Position(position.move(gameRule));
            cars.movePosition(position);

            System.out.println(gameRule.getRandomNumber());
            System.out.println(cars.getCar12());
            System.out.println(cars.getPositions());
        }
    }

    public void inputCars() {
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
        gameplay.inputCars();
        gameplay.inputTryNumber();
        gameplay.asd();
    }

}
