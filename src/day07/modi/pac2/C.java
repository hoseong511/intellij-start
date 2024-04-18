package day07.modi.pac2;

import day07.modi.pac1.A;
import day07.modi.pac1.B;

/**
 * packageName    : day07.modi.pac2
 * fileName       : C
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 *
 * 패키지 내에서만 default은 접근 가능
 * 패키지 상관없이 public은 모두 접근 가능
 * 패키지 상관없이 private은 모두 접근 불가능
 */
public class C {
    void test() {
        A a = new A(100);
//        new A(3.14); // default

        a.f1 = 10;
//        a.f2 = 20;

        B b = new B();

    }
}
