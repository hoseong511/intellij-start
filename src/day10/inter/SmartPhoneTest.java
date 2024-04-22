package day10.inter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : day10.inter
 * fileName       : SmartPhoneTest
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
class SmartPhoneTest {
	@Test
	@DisplayName("iphone 인스턴스")
	void showIphone() {
		// give
		Iphone iphone = new Iphone();
		// then
		assertThat(iphone instanceof SmartPhone).isTrue();
	}

	@Test
	@DisplayName("Galaxy 인스턴스")
	void showGalaxy() {
		// give
		Iphone iphone = new Iphone();


	}

}