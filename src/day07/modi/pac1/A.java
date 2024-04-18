package day07;

import day07.modi.pac1.B; /**
 * packageName    : day07
 * fileName       : A
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 */
public class A {
    public int f1;
    int f2; // default제한
    private int f3;

    // 메서드
    public void m1() {
    }

    void m2() {
    }  // default 제한

    private void m3() {
    }

    // 생성자
    public A(int a) {
    }

    A(double b) {
    }

    private A(boolean c) {
    }

    void test() {
        this.f1 = 10;
        this.f2 = 10;
        this.f3 = 10;

        m1();
        m2();
        m3();

        new B.A(10); // public
        new B.A(5.5); // default
        new B.A(false); // private
    }
}
