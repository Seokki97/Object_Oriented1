package baseballgame2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//자신이 선택한 수를 플레이어 넘버에 넘겨준다
public class Player {

    private List<Integer> playerBallNumber;



    public List<Integer> makePlayerNumber(){
        PlayerNumber playerNumber =new PlayerNumber();

        playerBallNumber = playerNumber.playerNumber;
        return playerBallNumber;
    }

}
