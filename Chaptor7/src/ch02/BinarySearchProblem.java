package ch02;

public class BinarySearchProblem {
    public static void main(String[] args) {
        int[] array = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int mid = array.length / 2;
        int findNumber = 83;
        int result = 0;
        if (array[mid] <= findNumber) {
            for (int i = mid; i < array.length; i++) {
                if (findNumber == array[i]) {
                    result = i;
                }
            }
        } else {
            for (int i = mid; i <= 0; i--) {
                if (findNumber == array[i]) {
                    result = i;
                }
            }

        }
        System.out.println(findNumber + "의 위치는" + result + "입니다");
    }
}
