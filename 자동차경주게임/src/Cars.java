import java.util.ArrayList;
import java.util.List;

public class Cars {
    private  List<Car> carsList = new ArrayList<>();


    public void inputCarsList(Input input){
        GameMessage.showInputCarNameMessage();
        input.inputCarName();
        for(String s : input.inputCarName()){
            carsList.add(new Car(s));
        }
    }
    public List<Car> getCar12(){
        return carsList;
    }
    @Override
    public String toString(){
        return "차는"+carsList;
    }

    public static void main(String[] args) {
        Cars cars = new Cars();

        Input input = new Input();

        cars.inputCarsList(input);
        System.out.println(cars.toString());
    }
}
