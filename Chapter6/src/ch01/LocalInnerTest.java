package ch01;

class Outer{
    int outNum =100;
    static int sNum = 200;


    Runnable getRunnable(final int i ){
        final int num = 100;

       /* class MyRunnable implements Runnable{ //java.lang패키지에 선언되는 인터페이스 -> 쓰레드를 이용할때 필요함

            int localNum = 10;
            @Override
            public void run(){
                //num = 200 ; >에러남 지역변수는 상수로 바뀜
                //i = 100; >에러남, 매개변수 역시 지역변수처럼 상수로 바뀜
                //안되는 이유는 getRunnble메서드 생성주기랑 클래스 생성주기가 달라서..
                //그래서 final로 처리해야함
                System.out.println("i=" +i);
                System.out.println("num=" +num);
                System.out.println("local num = " + localNum);

                System.out.println("outNum = " + outNum+"(외부 클래스 인스턴스 변수");
                System.out.println("Outter.sNum" + ch01.Outer.sNum + "(외부ㅡㅋ래스 정적변수");
            }
        }*/
        //return new MyRunnable(); 클래스 이름을 리턴할때 빼고는 쓸일이 없음 그래서 선언부에 클래스이름대신
        return new Runnable(){ //이렇게 선언함함 이게 익명내부클래스임.
            int localNum = 10;
            @Override
            public void run(){
                //num = 200 ; >에러남 지역변수는 상수로 바뀜
                //i = 100; >에러남, 매개변수 역시 지역변수처럼 상수로 바뀜
                //안되는 이유는 getRunnble메서드 생성주기랑 클래스 생성주기가 달라서..
                //그래서 final로 처리해야함
                System.out.println("i=" +i);
                System.out.println("num=" +num);
                System.out.println("local num = " + localNum);

                System.out.println("outNum = " + outNum+"(외부 클래스 인스턴스 변수");
                System.out.println("Outter.sNum" + Outer.sNum + "(외부ㅡㅋ래스 정적변수");
            }

        };
    }
}
public class LocalInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(10);
        runner.run();
    }
}
