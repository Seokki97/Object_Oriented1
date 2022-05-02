package ch28;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();


        Buy buyer = customer; //buy란 타입으로 customer를 맵핑시킨것. 업캐스팅임
         buyer.buy();
         buyer.order();


         Sell seller = customer;
         seller.sell();
         seller.order();
    }

}
