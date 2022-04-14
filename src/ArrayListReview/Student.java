package ArrayListReview;

import ch07.Subject;

import java.util.ArrayList;

public class Student {

    private static int studentId = 1000;
    int subjectCount;
    int id;
    String name;
    int score;
    ArrayList<Subject> subjectList ;


    public Student(int subjectCount){
        this.subjectCount = subjectCount;

        subjectList = new ArrayList<Subject>();
    }

    public void getStudentId(){
        this.studentId = studentId;
        studentId++;
        id = studentId;
    }

    public int setStudentId(){
        return id;
    }

    public void showStudentInfo(){
        System.out.println("학번은"+id);
    }


}
