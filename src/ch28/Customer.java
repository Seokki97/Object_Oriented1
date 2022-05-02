package ch28;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("손님이 물건을 삽니다");
    }
    /*@Override
    public void order(){
        System.out.println("customer order");
    }*/

    @Override
        public void sell() {
            System.out.println("손님이 물건을 팝니다");
        }

        @Override
        public void order(){
        System.out.println("Customer order");
        }

    public void hello(){
        System.out.println("안녕");
    }
}

