package adaptorPattern;

public class SocketAdapter implements Electronic110V{

    private Electronic220V electronic220V; //110v에서 220v로 전환하는 것이기 때문에 220볼트를 가져와소ㅓ

    public SocketAdapter(Electronic220V electronic220V){ //생성자에 매개변수로 받아줌
        this.electronic220V = electronic220V;
    }
    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
