package ch06;

public class Student {
    public int  studentNumber;
    public int grade;
    public String studentName;

    public Student(){} //그래서 이렇게 만들어야함
    public  Student(int studentNumber, int grade, String studentName){
        this.studentNumber = studentNumber;
        this.grade = grade;
        this.studentName = studentName;
    }
 //이렇게 하면 실행할때 오류남 이유는 클래스에 생성자가 없는경우 컴파일러가 생성자 코드를 알아서 넣어주는데
    // 이미 클래스에 생성자를 만들었기 때문.
    public String showStudentInfo(){

        return studentNumber +"은" + grade + "학녀이고" + "이름은" + studentName +"입니다.";
    }
}

