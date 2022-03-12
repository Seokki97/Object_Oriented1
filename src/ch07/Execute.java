package ch07;

public class Execute {

    public static void main(String[] args) {
    Student studentLee = new Student(100, "lee");
    studentLee.setKoreaSubject("국어", 100);
    studentLee.setMathSubject("수학", 100);


    Student studentPark = new Student(100, "lee");

    studentPark.setKoreaSubject("국어", 100);
    studentPark.setMathSubject("수학", 100);

    studentLee.showScoreInfo();
    studentPark.showScoreInfo();
    }
}
