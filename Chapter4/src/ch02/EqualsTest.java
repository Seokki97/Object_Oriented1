package ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student jun = new Student(100, "준석");
        Student si = new Student(100, "준석");

        System.out.println(jun == si); //다른 객체이므로 false 반환
        System.out.println(jun.equals(si)); //주소값이 다르니까 false 반환

        System.out.println(jun.hashCode());
        System.out.println(si.hashCode());


        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Student copyStudent = (Student)jun.clone();
        System.out.println(copyStudent.toString()); //복제 clone메서드
    }
}
