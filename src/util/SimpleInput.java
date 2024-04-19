package util;

import java.util.Scanner;

public class SimpleInput {
    private static Scanner sc ;

    static {
        sc = new Scanner(System.in);
    }

    // 문자열 입력을 처리
    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
