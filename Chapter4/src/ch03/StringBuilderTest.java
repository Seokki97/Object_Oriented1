package ch03;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java ");
        String android = new String("android");

        StringBuilder buffer = new StringBuilder(java);
        buffer.append(android);

        String test = buffer.toString(); //toString메서드는 Object클래스가 가진 메서드임.
        //객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메서드임.
        System.out.println(test);
    }
}
