import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Input {
    final Scanner sc = new Scanner(System.in);
    int tryNumber;
    List<String> carList = new ArrayList<>();
    public void inputMoveNumber(){
        tryNumber = sc.nextInt();
    }

    public List<String> inputCarName() {
        String inputCarName = sc.nextLine();

        carList = Arrays.stream(inputCarName.split(",")).collect(Collectors.toList());
        return carList;
    }

    public int getTryNumber(){
        return getTryNumber();
    }
}
