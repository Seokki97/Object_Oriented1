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
        c1.serialNum++;

        Employee c2 = new Employee();

        c2.setEmployeeName("시영");
        c2.setEmployeeId(c2.serialNum);

        System.out.println(c2.serialNum);
        System.out.println(c2.getEmployeeName());
        System.out.println(c1.getEmployeeId());



    }
}
