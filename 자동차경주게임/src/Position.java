public class Position {
    private final int position;

    public Position(final int position) {
        this.position = position;

    }

    public Position move() {
        return new Position(position + 1);
    }

    public int getPosition(){
        return position;
    }
}
