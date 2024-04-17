package day06.util;

import java.util.Scanner;

public class SimpleInput {
    Scanner sc = new Scanner(System.in);

    // 문자열 입력을 처리
    public String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
