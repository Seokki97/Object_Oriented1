package ch04;

import java.util.Arrays;

public class IntArrayStreamTest {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

      /*  for(int num :arr){
            System.out.println(num);
        } //일반적*/

        Arrays.stream(arr).forEach(n->System.out.println(n));//하나씩 꺼내는것, 뒤엔 람다식
        System.out.println(Arrays.stream(arr).sum());

    }
}
