import java.util.Scanner;

public class Input {
    final Scanner sc = new Scanner(System.in);
    int tryNumber ;
    String[] carName;

    public void inputMoveNumber(){
        tryNumber = sc.nextInt();
    }

    public String[] inputCarName() {
        String inputCarName = sc.nextLine();

        carName = inputCarName.split(","); //3개가 생겼어
        return carName;
    }

}
