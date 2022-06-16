import java.util.ArrayList;
import java.util.List;

public class Position {
    private  int position;
    private List<Position> positions ;
    public Position(int position) {
        this.position = position;
        positions  = new ArrayList<>();
    }

    public void setPosition(Cars cars){
        for(int i =0; i<cars.getCar12().size() ; i++){
            positions.add(new Position(0));
        }
    }


    public int move(GameRule gameRule) {
        if(gameRule.moveCarCondition()) {
            return position+1;
        }
        else return position;
    }

    public int getPosition(){
        return position;
    }
    public List<Position> getPositions()
    {
        return positions;
    }
}
