package onetry;

public class Position {
    private int position;

    public Position(){
    }
    public Position(int position) {
        this.position = position;

    }
    public int move(GameRule gameRule, int i) {

        if(gameRule.moveCarCondition()==true) {
            return position += i+1;
        }
        else return position += i;
    }

    public int getPosition(){
        return position;
    }

    @Override
    public String toString(){
        return "위치는 " +position;
    }
}
