package day03;

import java.util.Arrays;
import java.util.Scanner;

public class MethodBasic {
    static String[] add(String n1, String n2) {
        return new String[]{n1, n2};
    }

    static int addAll(int... list) {
        int result = 0;
        for (int i : list) {
            result += i;
        }
        return result;
    }

    static int[] operate(int n1, int n2) {
        int plus = n1 + n2;
        int minus = n1 - n2;
        int multiple = n1 * n2;
        int div = n1 / n2;
        return new int[] {plus, minus, multiple, div};
    }

    public static void main(String[] args) {
        System.out.printf("%s\n", Arrays.toString(add("hi", "h2")));
        double random = Math.random();
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int num2 = addAll(new int[] {1, 2,3,4,5,6});
        int num3 = addAll(1, 2,3,4, 5);
        System.out.printf("%d %d",num2, num3);
    }
}
