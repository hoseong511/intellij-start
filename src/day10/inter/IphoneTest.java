package day10.inter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : day10.inter
 * fileName       : IphoneTest
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
class IphoneTest {
	@Test
	@DisplayName("iphone 인스턴스")
	void showIphone() {
		// give
		Iphone iphone = new Iphone();

		iphone.camera();
	}

}