package ch06;

public class Student {
    public int  studentNumber;
    public int grade;
    public String studentName;

    public String showStudentInfo(){

        return studentNumber +"은" + grade + "학녀이고" + "이름은" + studentName +"입니다.";
    }
}

