package ch07;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] arr = {1,23,5,3,6};
        try{
            for(int i=0 ; i<=5; i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("비정상 종료되지 않았습니다.");
    }
}
