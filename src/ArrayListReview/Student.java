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
        for(Subject subject : subjectList){ //for each문임
            total += subject.getScore();
            System.out.println("학생" + studentName + "의" + subject.getName() + "성적은" + subject.getScore() + "입니다");
        }
    }


}
