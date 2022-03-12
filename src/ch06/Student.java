package ch06;

public class Student {
    public int  studentNumber;
    public int grade;
    public String studentName;

    public  Student(int studentNumber, int grade, String studentName){
        this.studentNumber = studentNumber;
        this.grade = grade;
        this.studentName = studentName;
    }

    public String showStudentInfo(){

        return studentNumber +"은" + grade + "학녀이고" + "이름은" + studentName +"입니다.";
    }
}

