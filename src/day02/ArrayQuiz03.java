package day02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {
    public static void main(String[] args) {
        String[] members = new String[]{"영웅", "최강", "시아", "믹키", "유노"};
        Scanner scan = new Scanner(System.in);
        System.out.printf("변경 전 정보: %s\n", Arrays.toString(members));
        while (true) {
            System.out.print("- 수정할 멤버의 이름을 입력하세요.\n>> ");
            String input = scan.nextLine();
            if (input.equals("그만")) {
                System.out.println("종료합니다!");
                break ;
            }
            int i = 0;
            for (; i < members.length && !members[i].equals(input); i++) {
                ;
            }
            if (i == members.length) {
                System.out.printf("%s은(는) 없는 이름입니다.\n", input);
            } else {
                System.out.printf("%s의 이름을 변경합니다\n>> ", input);
                String modify = scan.nextLine();
                members[i] = modify;
                System.out.printf("변경완료!\n* 변경 후 정보: %s\n", Arrays.toString(members));
            }
        }
    }
}
