package ch22;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer junseok = new Customer("준석",1001);
        GoldCustomer siyoung = new GoldCustomer("시영", 1002);
        VipCustomer junmin = new VipCustomer("준민", 1003);
        junseok.calcPrice(1000);
        siyoung.calcPrice(1000);
        junmin.calcPrice(1000);

        ArrayList<Customer> customerList = new ArrayList<>();

        CustomerTest test = new CustomerTest();

        customerList.add(junseok);
        customerList.add(siyoung);
        customerList.add(junmin);

        for(Customer customer : customerList){
           System.out.println( customer.showCustomerInfo());
        }
    }
    }

