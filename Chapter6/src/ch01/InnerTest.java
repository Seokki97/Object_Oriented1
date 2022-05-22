package ch01;
class OutClass{

    private int num = 10;
    private static int sNum =20;
    private InClass inClass;
    public OutClass(){
        inClass = new InClass();
    }
   private class InClass{

        int iNum = 100;
        static int stue =20;

        void inTest(){
            System.out.println("OutClass num =" + num + "(외부 클래스의 인스턴스 변수");
            System.out.println("OutClass num =" + sNum + "(외부 클래스의 인스턴스 변수");
            System.out.println("InClass num =" + iNum + "(내부 클래스의 인스턴스 변수");
        }
    }
    public void usingClass(){
        inClass.inTest();
    }
    static class InStaticClass{ //정적 내부 클래스
        int Inum = 100;
        static int sInNum = 200;

        void inTest(){ //정적클래스의 내부메서드에선 외부의 인스턴스 변수를 사용할수가없음 누가 먼저 호출될지 모르기떄문에
            System.out.println("OutClass num =" + Inum + "(외부 클래스의 인스턴스 변수");
            System.out.println("OutClass num =" + sNum + "(외부 클래스의 인스턴스 변수");
            System.out.println("InClass num =" + sInNum + "(내부 클래스의 인스턴스 변수");
        }

        static void sTest(){
            System.out.println("OutClass num =" + sNum + "(외부 클래스의 인스턴스 변수");
            System.out.println("InClass num =" + sInNum + "(내부 클래스의 인스턴스 변수");

        }
    }
}

public class InnerTest {
    public static void main(String[] args) {

      /*  OutClass oc = new OutClass();
        //OutClass.InClass ic = oc.new InClass(); // private class로 선언되었기때문에 안됨

        oc.usingClass(); //은 됨*/
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
        System.out.println();
        sInClass.sTest();
    }
}
