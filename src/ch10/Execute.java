package ch10;

public class Execute {
    public static void main(String[] args) {
        Person ps = new Person();
        ps.showPerson();
        System.out.println(ps.getPerson()); //자기자신의 주소값을 반환하는 생성자
    }
}
