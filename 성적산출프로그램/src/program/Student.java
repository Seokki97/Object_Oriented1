package program;

public class Student {
    private String studentName;
    private int studentId;
    private Subject major;

    public Student(String studentName, int studentId, Subject major){
        this.studentName = studentName;
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Subject getMajor() {
        return major;
    }

    public void setMajor(Subject major) {
        this.major = major;
    }
    @Override
    public String toString(){
        return getStudentName() + getStudentId() + getMajor();
    }
}
