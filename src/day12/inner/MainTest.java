package day12.inner;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : day12.inner
 * fileName       : MainTest
 * author         : hoho
 * date           : 4/24/24
 * description    :
 */
class MainTest {

	public static class SubCalculator implements Calculator {
		@Override
		public int operate(int n1, int n2) {
			return n1 - n2;
		}
	}

	Calculator cal;

	@Test
	@DisplayName("계산기 구현체 : AddCalculator")
	void 메인() {
		cal = new AddCalculator();
		int r1 = cal.operate(10, 20);
		System.out.println("r1 = " + r1);
	}

	@Test
	void 뺄셈() {
		cal = new SubCalculator();
		int r1 = cal.operate(20, 10);
		System.out.println("r1 = " + r1);
	}

	/* 익명 클래스 : 한번 만 사용하고 싶을 때, */
	@Test
	void 익명_클래스_곱셈() {
		cal = new Calculator() {
			@Override
			public int operate(int n1, int n2) {
				return n1 * n2;
			}
		};
		System.out.println("cal.operate(20, 10) = " + cal.operate(20, 10));
	}

	/* 람다 사용 조건 - 인터페이스 안에 추상메서드는 1개인 경우만 가능*/
	@Test
	void 익명_클래스_나눗셈_람다() {
		cal = (n1, n2) ->  n1 / n2;
		System.out.println("cal.operate(20, 10) = " + cal.operate(20, 10));
	}
}