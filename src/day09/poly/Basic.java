package day09.poly;

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
 * 다형성 : 상속의 관계라면 상속 **받은** 타입을 사용가능
 * 다형성은 객체의 교환성을 높여주며 객체가 특정 객체에 종속 x (의존성이 낮아짐)
 */

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}
public class Basic {
	void test() {
		Object a = new A();
		B b = new B();
		C c = new C();
	}
}
