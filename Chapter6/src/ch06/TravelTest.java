package ch06;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이시영", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김준석", 26, 100);
        TravelCustomer customerHong = new TravelCustomer("홍기준", 15, 50);


        List<TravelCustomer> customerList = new ArrayList<>();

        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("==고객 명단 추가된 순서대로 출력 ==");
        customerList.stream().map(c ->c.getCustomerName()).forEach(s->System.out.println(s)); //최종연산인 forEach를 꺼내고 그다음 조건을 정하는 중간연산을 꺼내는게 편리하다!

        int total = customerList.stream().mapToInt(c->c.getCost()).sum();
        System.out.println(" 총 여행 비용은:" +total + "입니다.");


        System.out.println("==20세 이상 고객 명단 정렬하여 출력 ==");
        customerList.stream().filter( s -> s.getCustomerAge() >=20).map(s->s.getCustomerName()).sorted().forEach(s ->System.out.println(s)); //마찬가지로, 최종연산전에 filter로 age를 거치고 map으로 이름을 가져온다음. 정렬을 하였다.

    }
}
