package ArrayListReview;

public class Student {

    private static int studentId = 1000;
    int subjectCount;
    int id;

    public Student(int subjectCount){
        this.subjectCount = subjectCount;
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
