import java.util.ArrayList;
import java.util.List;

public class Cars {
    private List<Car> carsList = new ArrayList<Car>();
    private List<Position> positions = new ArrayList<>();

    public void inputCarsList(Input input) {
        input.inputCarName();
        for (String s : input.carList) {
            carsList.add(new Car(s));
        }
    }

    public void setPositions(Position position) {
        for (int i = 0; i < carsList.size(); i++) {
            positions.add(i, new Position(position.getPosition()));
        }
    }

    public List<Position> getPositions() {
        return positions;
    }

    public List<Car> getCar12() {
        return carsList;
    }

}
