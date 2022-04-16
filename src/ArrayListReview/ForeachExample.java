package ArrayListReview;

public class ForeachExample {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for(int i = 0 ; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //랑 같음
        for(String number : numbers){
            System.out.println(number);
        }

        /*
        for(type var : iterate){
        body-of-loop
        }
        literate는 루프를 돌릴 객체, 즉 생성하는거임. type var은 자료형임.
         */
    }

}
