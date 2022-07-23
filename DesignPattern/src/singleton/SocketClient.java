package singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    //싱글톤패턴은 기본적으로 default생성자를 private로 막아준다
    private SocketClient(){

    }
    //static메서드로 getInstance를 만들어준다
    public static SocketClient getInstance(){

        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    } //자기 자신을 생성

    public void connect(){
        System.out.println("connect");
    }
}
