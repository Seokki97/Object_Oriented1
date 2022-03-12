package ch040506review;

public class Execute {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer();
        foodDelivery foodDelivery1 = new foodDelivery(2110200003, 01023450001, "서울시 강남구 역삼동 111-333", 20201102
                , 130258, 35000, 0003);
        consumer1.consumerName ="Thomas";
        consumer1.age = 37;
        consumer1.height = 187;
        consumer1.weight = 80;
        System.out.println(consumer1.consumerInfo());
        System.out.println(foodDelivery1.deliveryInfo());
    }
}
