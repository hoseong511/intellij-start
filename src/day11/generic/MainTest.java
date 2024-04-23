package day11.generic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : day11.generic
 * fileName       : MainTest
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */
class MainTest {
	@Test
	@DisplayName("1.")
	void main() {
		AppleBasket ab = new AppleBasket();

		Basket basket = new Basket();
		basket.setFruit(new Apple(1));

		Basket<Apple> appleBasket = new Basket<Apple>();
		appleBasket.setFruit(new Apple(1));
		Apple fruit = appleBasket.getFruit();

		Basket<Banana> bananaBasket = new Basket<>();
		bananaBasket.setFruit(new Banana(3));

	}

}