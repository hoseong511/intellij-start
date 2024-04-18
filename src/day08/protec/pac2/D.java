package day08.protec.pac2;

import day08.protec.pac1.A;

/**
 * packageName    : day08.protec.pac2
 * fileName       : D
 * author         : hoho
 * date           : 4/18/24
 * description    : 상속 시, protected 제한자 설정된 멤버 접근 가능
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class D extends A {
	D() {
		super(100);
		super.f1 = 100;
	}

}
