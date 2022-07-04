package ch01;

import java.sql.Array;
import java.util.Arrays;

public class MinMaxProblem {

    public static void main(String[] args) {
        int[] array = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
        int max = array[0];
        int min = array[0];
        int maxPosition=0;
        int minPosition=0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
                maxPosition = i;
            }

            if(min > array[i]){
                min = array[i];
                minPosition = i;
            }
        }
        System.out.println("MaxPosition은"+maxPosition+"minPosition은" + minPosition);
    }

}

