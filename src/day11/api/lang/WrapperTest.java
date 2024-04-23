package day11.api.lang;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * packageName    : day11.api.lang
 * fileName       : Wrapper
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */

class MethodTest {
	static void convert(Integer a) {

	}
}
public class WrapperTest {
	@Test
	@DisplayName("Wrapper")
	void main() {
		/*
		* byte, short, int, long, boolean, float, double, char
		* primitive type
		* */
		
		/*
		* Wrapper type
		* Byte, Short, Integer, Long, Boolean, Float, Double, Character
		* */
		Integer a = 10;
		MethodTest.convert(a);
		System.out.println("a = " + a);
	}
}
