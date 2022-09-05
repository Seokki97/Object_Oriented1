package program.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private Subject major;

    private List<Score> scoreList = new ArrayList<>();

    public Student(String studentName, int studentId, Subject major){
        this.studentName = studentName;
        this.studentId = studentId;
        this.major = major;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Subject getMajor() {
        return major;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }

}
