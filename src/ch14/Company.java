package ch14;

public class Company {

    private static Company instance = new Company(); //instance란 객체를 만듦
    private Company(){

    } //private로 생성자를 만듦

    public static Company getInstance(){ //static으로 선언해야 외부에서 클래스이름으로 호출할 수 있음.
        if( instance == null){
            instance = new Company();
        }
        return instance;
    }
}
