package ch22;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer junseok = new Customer("준석",1001);
        Customer siyoung = new GoldCustomer("시영", 1002);
        Customer junmin = new VipCustomer("준민", 1003);
        junseok.calcPrice(1000);
        siyoung.calcPrice(1000);
        junmin.calcPrice(1000);

        ArrayList<Customer> customerList = new ArrayList<>();

        CustomerTest test = new CustomerTest();

        customerList.add(junseok);
        customerList.add(siyoung);
        customerList.add(junmin);

     // for(Customer customer : customerList){
      //     System.out.println( customer.showCustomerInfo());
       // }
        if( siyoung instanceof GoldCustomer){ //시영 인스턴스가 원래 goldCustomer의 타입의 인스턴스였냐 라고 물어보는 거임
            GoldCustomer vc = (GoldCustomer)siyoung;
            System.out.println(siyoung.showCustomerInfo());
        }

    }
    }

