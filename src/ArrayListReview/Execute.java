package ArrayListReview;

public class Execute {
    public static void main(String[] args) {
        Student kim = new Student(1001,"김준석");
        Student lee = new Student(1002 , "이시영");

        kim.addSubject("국어",100);
        kim.addSubject("수학", 50);

        lee.addSubject("국어",70);
        lee.addSubject("수학",85);
        lee.addSubject("영어",100);

        kim.showStudentInfo();
        lee.showStudentInfo();
    }
}
