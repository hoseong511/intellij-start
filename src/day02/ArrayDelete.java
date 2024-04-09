package day02;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {
//        배열의 특정 위치 값 삭제
        int[] numbers = {1, 3, 5, 7, 9};

        int idx = 2;
        int[] temp = new int[numbers.length - 1];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (idx == i) {
                continue;
            }
            temp[j] = numbers[i];
            j++;
        }
        numbers = temp;
        temp = null;
        System.out.println("numbers: " + Arrays.toString(numbers));
    }
}
