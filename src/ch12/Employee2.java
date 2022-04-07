package ch12;

public class Employee2 {

    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee2(){
        serialNum++;
        employeeId = serialNum;
    } //한명씩 사번 부여하고 증가하기

    public static int getserialNum(){
        return serialNum;
    } //이렇게 해서 메소드를 호출하면 앞서 private로 설정된 serialnum에 접근할수있다.
    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }


}
