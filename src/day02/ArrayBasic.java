package day02;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i : arr) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println("i = " + i);
        }
        System.out.println(Arrays.toString(arr));

        String[] pets = {"dog", "bird", "bobby"};
        System.out.println(Arrays.toString(pets));
        pets = new String[] {"a", "b"};
        System.out.println(Arrays.toString(pets));
        System.out.println(Arrays.toString(getNumbers()));

//      깊은 복사와 얕은 복사 -> 메모리 주소값이 할당

    }
    static int[] getNumbers() {
        return new int[] {1, 2, 3};
    }
}
