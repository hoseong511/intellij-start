package day09;

/**
 * packageName    : day09
 * fileName       : Basic
 * author         : hoho
 * date           : 4/19/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/19/24        hoho       최초 생성
 * 다형성
 */

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}
public class Basic {
	void test() {
		Object a = new A();
		A b = new B();
	}
}
