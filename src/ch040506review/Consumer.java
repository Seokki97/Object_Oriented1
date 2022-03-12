package ch040506review;
/*키가 180 몸무게가 78킬로인 남자가 있다. 이름은 Tomas 나이는 37세
음식점에 배달 주문이 들어옸다.
접수번호 : 202011020003
주문 폰번호 : 01023450001
주문 집 주소: 서울시 강남구 역삼동 111-333
주문 날짜: 20201102
주문 시간: 130258
주문 가격: 35000
메뉴 번호 : 0003
다음 설명에 해당되는 객체를 구현하고 해당 정보를 출력하시오.
 */
public class Consumer {
    foodDelivery foodDelivery1 = new foodDelivery(2110200003, 01023450001, "서울시 강남구 역삼동 111-333", 20201102
    , 130258, 35000, 0003);
    String consumerName;
    int age;
    int height;
    int weight;

    public String consumerInfo(){


        return "이름:" + consumerName + "나이:" + age + "키:"+ height + "몸무게:" + weight+"입니다";
    }
    public String deliveryInfo(){
        return "접수번호:" +foodDelivery1.number + "휴대폰번호" +foodDelivery1.phoneNumber +"주소:" + foodDelivery1.address
                + "주문날짜" + foodDelivery1.day + "주문시간" + foodDelivery1.time + "가격" + foodDelivery1.price +"접수번호" +
                foodDelivery1.menuNumber;
    }
}
