package program.model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int subjectId;
    private String subjectName;
    private int gradeType;

    private List<Student> studentList = new ArrayList<>();

    public Subject(int subjectId, String subjectName, int gradeType){
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeType = gradeType;
    }

    public void addRegister(Student student){
        studentList.add(student);
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", gradeType=" + gradeType +
                ", studentList=" + studentList +
                '}';
    }
}
