package day10.exception;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : day10.exception
 * fileName       : LoginUserTest
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
class LoginUserTest {
	@Test
	@DisplayName("로그인 성공 여부")
	void 로그인() {
		// give
		LoginUser user = new LoginUser("hoho", "1234");
		assertAll(
			() -> assertThrows(InvalidLoginInputException.class, () -> user.loginValidate("hoho", "12345")),
			() -> assertThrows(InvalidLoginInputException.class, () -> user.loginValidate("hoho1", "12345"))
		);
	}
}