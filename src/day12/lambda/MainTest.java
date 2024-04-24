package day12.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.*;

/**
 * packageName    : day12.lambda
 * fileName       : FilterAppleTest
 * author         : hoho
 * date           : 4/24/24
 * description    :
 */
class MainTest {
	List<Apple> appleList;

	@BeforeEach
	void before() {
		appleList = List.of(
				new Apple(80, GREEN)
				, new Apple(155, GREEN)
				, new Apple(120, RED)
				, new Apple(97, RED)
				, new Apple(200, GREEN)
				, new Apple(50, RED)
				, new Apple(85, YELLOW)
				, new Apple(75, YELLOW));
	}

	@Test
	void 녹색_사과_필터링() {
		// give
		// when
		List<Apple> apples = filterGreenApples(appleList);
		// then
		for (Apple filterGreenApple : apples) {
			System.out.println(filterGreenApple);
		}
	}

	@Test
	void 사과_필터링() {
		// give
		// when
		List<Apple> apples = filterColorApples(appleList, RED);
		// then
		for (Apple filterGreenApple : apples) {
			System.out.println(filterGreenApple);
		}
	}

	@Test
	void 필터링_추상메서드_활용() {
		// give
		// when
		List<Apple> apples = filterApples(appleList, new ApplePredicate() {
			@Override
			public boolean test(Apple apple) {
				return apple.getColor() == YELLOW;
			}
		});
		// then
		for (Apple filterGreenApple : apples) {
			System.out.println(filterGreenApple);
		}
	}
	@Test
	void 필터링_추상메서드_활용1() {
		// give
		// when
		List<Apple> apples = filterApples(appleList, (a) -> a.getWeight() >= 100);
		// then
		for (Apple filterGreenApple : apples) {
			System.out.println(filterGreenApple);
		}
	}
	@Test
	void 필터링_추상메서드_활용2() {
		// give
		// when
		List<Apple> apples = filterApples(appleList, (a) -> a.getColor() == RED || a.getColor() == GREEN);
		// then
		System.out.println("apples = " + apples);
	}
	@Test
	void 제너릭_필터링_활용() {
		// give
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// when
		List<Integer> filter = filter(numbers, n -> n % 2 == 0);
		// then
		System.out.println("filter = " + filter);
	}

	@Test
	void 맵_활용_사과색깔() {
		// give
		// when
		List<Color> map = MapApple.mappingApplesByColor(appleList);
		//then
		System.out.println("map = " + map);
	}
	@Test
	void 맵_제네릭함수_활용() {
		// give
		// when
		List<Color> map = MapApple.map(appleList, new GenericFunction<Apple, Color>() {
			@Override
			public Color apply(Apple apple) {
				return apple.getColor();
			}
		});
		//then
		System.out.println("map = " + map);
	}
	@Test
	void 맵_제네릭함수_활용2_사과무게() {
		// give
		// when
		List<Integer> weightList = MapApple.map(appleList, (apple) -> apple.getWeight());
		// then
		System.out.println(weightList);

	}
	@Test
	void 맵_제네릭함수_활용3() {
		// give
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// when
		List<Integer> list = MapApple.map(numbers, (num) -> num * num);
		// then
		System.out.println(list);
	}
}