package ch03;

public class StringTest {
    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java)); //메모리 사용 주소 보기
        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java)); //주소가 다르단 걸 확인할수있가
    }
}
