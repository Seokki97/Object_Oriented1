package ch04;
public class Practice {

    public int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo(){
        System.out.println( studentID + "학번의 이름은" + studentName + "이고, 주소는" + address + "입니다");
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){
        studentName = name; //이름을 설정하는것
    }
}