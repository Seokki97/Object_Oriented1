import java.util.ArrayList;
import java.util.List;

public class Position {
    private int position;

    public Position(int position) {
        this.position = position;

    }
    public int move(GameRule gameRule) {
        if(gameRule.moveCarCondition()==true) {
            return position+1;
        }
        else return position;
    }

    public int getPosition(){
        return position;
    }

    @Override
    public String toString(){
        return "위치는 " +position;
    }
}
