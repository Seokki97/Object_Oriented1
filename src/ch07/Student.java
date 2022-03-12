package ch07;

public class Student {
    String studentName;
    int studentId;

    Subject korea;
    Subject math;

    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject(); //참조자료형을 사용할때 자동으로 초기화하기위해
        math = new Subject();  //초기화를 안해주면 nullpointexception발생..
    }
    public void setKoreaSubject(String name, int score){
        korea.subjectName = name;
        korea.score = score;

    }
    public void setMathSubject( String name, int score){
        math.subjectName = name;
        math.score = score;
    }
    public void showScoreInfo(){
        int total = korea.score + math.score;
        System.out.println(studentName + "의 토탈 성적은" + total + "이다.");
    }
}
