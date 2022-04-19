package ch20;

public class CustomerTest {
    public static void main(String[] args) {

        Customer junSeok = new Customer();

        junSeok.setCustomerId(1001);
        junSeok.setCustomerName("김준석");
        junSeok.setCustomerGrade("SILVER");

        int price =  junSeok.calcPrice(1000);
        System.out.println(price);
        System.out.println(junSeok.showCustomerInfo());

        VipCustomer siYoung = new VipCustomer();

        siYoung.setCustomerGrade("VIP");
        siYoung.setCustomerId(1002);
        siYoung.setCustomerName("이시영");

        price = siYoung.calcPrice(1000);
        System.out.println(price);
        System.out.println(siYoung.showCustomerInfo());


    }
    }

