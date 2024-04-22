package day10.exception;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import util.SimpleInput;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * packageName    : day10.exception
 * fileName       : TryExample1
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
public class TryExample1 {
	@Test
	@DisplayName("나눗셈 ")
	public void main() {
		int n1 = 10, n2 = 2;

		System.out.println("나눗셈!");

		int result = n1 / n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
		System.out.println("종료!");
	}

	@Test
	@DisplayName("0으로 나눗셈")
	public void div() {
		int n1 = 10, n2 = 0;

//		System.out.println("나눗셈!");


		assertAll(
				()-> assertThat(6 / 2).isEqualTo(3),
				()-> assertThat(6 / 2).isEqualTo(3)
				);
	}
	@Test
	@DisplayName("try catch")
	public void divTryCatch() {
		int n1 = 10, n2 = 0;
		try {
			int result = n1 / n2;
			System.out.printf("%d / %d = %d\n", n1, n2, result);
			System.out.println("종료!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	@DisplayName("scan num")
	public void divTry() {
		System.setIn(new ByteArrayInputStream("1".getBytes()));
		int num1 = Integer.parseInt(SimpleInput.input("정수 1 : "));
		System.setIn(new ByteArrayInputStream("\n3".getBytes()));
		int num2 = Integer.parseInt(SimpleInput.input("정수 2 : "));
		int result = num1 / num2;
		System.out.println("result = " + result);
	}
}
