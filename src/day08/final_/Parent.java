package day08.final_;

/**
 * packageName    : day08.final_
 * fileName       : Parent
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */

class Child extends Parent {
	@Override
	void sing() {
		System.out.println("my sing");
	}

	@Override
	void dance() {
		System.out.println("my dancing");
	}
}

public class Parent {
	final int a = 1;
	void sing() {
		System.out.println("sing");
	}
	void dance() {
		System.out.println("dancing");
	}
}
