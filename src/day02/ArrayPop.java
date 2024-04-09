package day02;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        int[] temp = new int[numbers.length - 1];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        int popedNumber = numbers[numbers.length - 1];
        numbers = temp;
        temp = null;
        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("temp: " + Arrays.toString(temp));
        System.out.println("popedNumber: " + popedNumber);
    }
}
