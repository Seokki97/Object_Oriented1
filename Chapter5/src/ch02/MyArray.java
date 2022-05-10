package ch02;

public class MyArray {
    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM= -999999;
    public MyArray(){
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size){
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void insertElement(int position, int num){

        int i ;

        if(count >= ARRAY_SIZE){
            System.out.println("ERROR");
            return;
        }

        if(position < 0 || position> count){
            System.out.println("Insert Error");
            return;
        }

        for( i = count-1 ; i >= position ; i--){
            intArr
        }
    }

}
