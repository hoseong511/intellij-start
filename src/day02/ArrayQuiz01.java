package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[0];
        int idx = 0;

        while (true) {
            System.out.print(">> ");
            String input = scan.nextLine();
            if (input.equals("그만")) break;
            if (idx > arr.length - 1) {
                arr = push(arr, input);
            }
            idx++;
        }
        System.out.println(Arrays.toString(arr));
    }

    static String[] push(String[] list, String str) {
        String[] temp = new String[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        temp[temp.length - 1] = str;
        return temp;
    }
}
