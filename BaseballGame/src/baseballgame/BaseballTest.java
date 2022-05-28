package baseballgame;

public class BaseballTest {

    public static void main(String[] args) {

        Player p1 = new Player();
        Computer cp1 = new Computer();
        Ball ball = new Ball();

        p1.stringToArray();
        cp1.randomBob();

        ball.makeStrike(p1.getInput(), cp1.getSetting());
        ball.makeBall(p1.getInput(), cp1.getSetting());
        ball.makeNothing(p1.getInput(), cp1.getSetting());

        System.out.println(ball.toString());

    }
}
