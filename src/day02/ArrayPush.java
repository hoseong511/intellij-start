package day02;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int newNumber = 50;
        System.out.println("numbers: " + Arrays.toString(numbers));
        numbers  = push(numbers, 10);
        System.out.println("numbers: " + Arrays.toString(numbers));

    }

    static int[] push(int[] list, int newNumber) {
        int[] temp = new int[list.length + 1];

        for (int j = 0; j < list.length; j++) {
            temp[j] = list[j];
        }
        temp[temp.length - 1] = newNumber;
        return temp;
    }

    ;

}
