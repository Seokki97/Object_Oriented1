package ch12;

public class Execute {
    public static void main(String[] args) {
        Employee c1 = new Employee();

        c1.setEmployeeId(c1.serialNum);
        c1.setEmployeeName("Junseok");
        c1.setDepartment("개발자");

        System.out.println(c1.getEmployeeName());
        System.out.println(c1.getDepartment());
        System.out.println(c1.getEmployeeId());


    }
}
