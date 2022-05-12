package ch02;

public class MyArray {
    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num) {
        if (count >= ARRAY_SIZE) {
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num) { //중간에 넣는거거

        int i;

        if (count >= ARRAY_SIZE) {
            System.out.println("ERROR");
            return;
        }

        if (position < 0 || position > count) {
            System.out.println("Insert Error");
            return;
        }

        for (i = count - 1; i >= position; i--) {
            intArr[i + 1] = intArr[i];
        }

        intArr[position] = num;
        count++;
    }
    // 0 1 2 3 4 5 6 7 4번째에 넣는다면 0 1 2 8 3 4 5 6 7
    // 1 2 3 4 5 6 7 8

    public int removeElement(int position) {

        int ret = ERROR_NUM;

        if (isEmpty()) {
            System.out.println("Array is empty");
            return ret;
        }

        if (position < 0 || position > count - 1) {

            return ret;
        }
        if (count >= ARRAY_SIZE) {
            System.out.println("error");
            return ret;
        }

        ret = intArr[position];
        for (int i = position; i < intArr.length; i++) {
            intArr[i] = intArr[i + 1];
        }
        count--;
        return ret;
    }



    public boolean isEmpty(){
        if(count ==0){
            return true;
        }
        else return false;
    }

    public void printAll(){
        if(count == 0){
            System.out.println("출력할 내용이 없습니다");
            return;
        }

        for(int i = 0 ; i <count ; i++){
            System.out.println(intArr[i]);
        }
    }

    public void removeAll(){
        for(int i =0; i<count ; i++){
            intArr[i] = 0;

        }
        count = 0;
    }
}
