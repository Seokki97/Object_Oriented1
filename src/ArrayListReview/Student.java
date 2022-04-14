package ArrayListReview;

public class Student {

    private static int studentId = 1000;
    String studentName;
    int id;

    public Student(String studentName){
        this.studentName = studentName;
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
