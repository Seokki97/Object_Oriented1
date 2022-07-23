package adaptorPattern;

public class HairDryer implements Electronic110V {

    @Override
    public void powerOn() {
    System.out.println("110V 헤어드라이기 on");
    }
}
