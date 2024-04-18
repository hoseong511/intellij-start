package day08.static_;

/**
 * packageName    : day08.static_
 * fileName       : Main
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */

import static util.SimpleInput.input;
import static day08.static_.Count.*;
public class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.y = 1;
        Count.x = 30;
        System.out.println("c1.y + Count.x = " + c1.y + " " + Count.x);

        c1.m2();
        m1();
        String name = input("이름을 입력하세요");

        System.out.println("\n=======================================\n");
        Person gp = new Person("hoho", 20);
        System.out.println(gp.name);
        System.out.println(gp.age);
        System.out.println(gp.nation);
    }
}
