package ch19;

public class CustomerTest {
    public static void main(String[] args) {
        /*Customer junSeok = new Customer();

        junSeok.setCustomerId(1001);
        junSeok.setCustomerName("김준석");
        junSeok.setCustomerGrade("SILVER");

        junSeok.calcPrice(120000);
        System.out.println(junSeok.showCustomerInfo()); */

        VipCustomer siYoung = new VipCustomer();

        siYoung.setCustomerGrade("VIP");
        siYoung.setCustomerId(1002);
        siYoung.setCustomerName("이시영");

        siYoung.vipCalcPrice(120000);
        System.out.println(siYoung.showCustomerInfo());


    }
}
