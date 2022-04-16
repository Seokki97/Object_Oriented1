package ArrayListReview;

import java.util.ArrayList;

public class Student {

    int studentId = 1000;
    int id;
    ArrayList<Subject> subjectList ;
    String studentName;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score){
        Subject addSub = new Subject();

        addSub.setName(name);
        addSub.setScore(score);
        subjectList.add(addSub);
    }

    public void getStudentId(){
        studentId++;
        id = studentId;
    }

    public int setStudentId(){
        return id;
    }

    public void showStudentInfo(){

        int total = 0 ;
        for(Subject s : subjectList){
            total += s.getScore();
            System.out.println("학생" + studentName + "의" + s.getName() + "성적은" + s.getScore() + "입니다");
        }
    }


}
