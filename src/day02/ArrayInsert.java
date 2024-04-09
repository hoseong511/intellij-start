package day02;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int tarIdx = 2;
        int insertNum = 10;
        int[] temp = new int[arr.length + 1];
        for (int i = 0, j = 0; i < temp.length; i++) {
            if (i == tarIdx) {
                temp[i] = insertNum;
                continue;
            }
            temp[i] = arr[j];
            j++;
        }
        arr = temp;
        System.out.printf("%s\n", Arrays.toString(arr));
    }
}
