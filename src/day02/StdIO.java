package day02;

import java.util.Scanner;

public class StdIO {
    public static void main(String[] args) {
        String name = "아지";
        System.out.printf("%s 강아지\n", name);

        Scanner scan = new Scanner(System.in);

        System.out.print("이름: ");
        String s = scan.nextLine();

        System.out.println("userName = " + s);

        System.out.print("출생년도: ");
        int birthYear = Integer.parseInt(scan.nextLine());
        System.out.println("birthYear = " + birthYear);

        System.out.print("상품의 가격: ");
        int price = Integer.parseInt(scan.nextLine());
        System.out.print("상품의 수량: ");
        int cnt = Integer.parseInt(scan.nextLine());
        System.out.printf("상품 재고 총액 : %d 원", price * cnt);

    }
}
