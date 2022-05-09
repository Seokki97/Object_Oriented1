package ch02;

public class Student implements Cloneable {
    private int studentNum;
    private String studentName;

    public Student(int studentNum, String studentName){
        this.studentName = studentName;
        this.studentNum = studentNum;
    }

    public String toString(){
        return studentName +","+ studentNum;
    }

   @Override
    public boolean equals(Object obj){
        if(obj instanceof  Student){
            Student std = (Student)obj;
            if(this.studentNum == std.studentNum){
                return true;

            }
            else return false;
        }
        return false;
    }
    /* equals 메서드를 오버라이딩해서 obj객체를 다운캐스팅 하고, Student클래스의 studentnum과
    obj의 studentNum을 비교하였을땐 같은 주소값이라고 나온다.

     */

    @Override
    public int hashCode(){
        return studentNum; //해쉬코드 오버라이딩
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
