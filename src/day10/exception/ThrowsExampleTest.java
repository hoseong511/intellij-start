package day10.exception;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : day10.exception
 * fileName       : ThrowsExampleTest
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
class ThrowsExampleTest {
	public static void main(String[] args) {
		ThrowsExample te = new ThrowsExample();
		int i = te.inputNumber();
		System.out.println("i = " + i);
	}

}