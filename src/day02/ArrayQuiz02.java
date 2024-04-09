package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[]{"믹키", "최강", "유노", "시아", "영웅"};
        System.out.printf("학생들의 별명 : %s\n", Arrays.toString(arr));
        while (true) {
            if (arr.length == 0) {
                break;
            }
            System.out.print("삭제할 학생의 별명을 입력하세요.\n> ");
            String input = scan.nextLine();
            int i = 0;
            for (; i < arr.length && !arr[i].equals(input); i++) {
                ;
            }
            if (i == arr.length) {
                System.out.printf("%s 은 존재하지 않는 별명 입니다.\n", input);
            } else {
                arr = remove(arr, i);
                System.out.printf("삭제 후 정보 : %s", Arrays.toString(arr));
            }
        }

    }

    static String[] push(String[] list, String str) {
        String[] temp = new String[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        temp[temp.length - 1] = str;
        return temp;
    }

    static String[] remove(String[] list, int idx) {
        String[] temp = new String[list.length -1];
        for (int i = 0, j = 0; i < list.length; i++) {
            if (idx == i)
                continue;
            temp[j] = list[i];
            j++;
        }
        return temp;
    }
}
