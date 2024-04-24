package day12.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : day12.lambda
 * fileName       : FilterTest
 * author         : hoho
 * date           : 4/24/24
 * description    : 람다활용하기
 * <p>
 * - 메서드를 추상화해서 활용하는 방법
 * 1. 클래스
 * 2. 인터페이스 + 클래스
 * 3. inner 클래스
 * 4. 익명 클래스
 * 5. 람다
 */

interface ApplePredicate {
	boolean test(Apple apple);
}

interface GenericPredicate<T> {
	boolean test(T fruit);
}

public class FilterApple {

	/**
	 * 바구니에서 녹색 사과만 필터링
	 *
	 * @param basket
	 * @return List<Apple> type
	 * @method filterGreenApples
	 * @author hoho
	 * @date 2024 04 24 14:44
	 */
	public static List<Apple> filterGreenApples(List<Apple> basket) {
		List<Apple> greenApples = new ArrayList<>();
		for (Apple apple : basket) {
			if (apple.getColor() == Color.GREEN) {
				greenApples.add(apple);
			}
		}
		return greenApples;
	}

	/**
	 * 색깔 별 사과 필터링
	 *
	 * @param basket
	 * @param color
	 * @return List<Apple> type
	 * @method filterColorApples
	 * @author hoho
	 * @date 2024 04 24 14:55
	 */
	public static List<Apple> filterColorApples(List<Apple> basket, Color color) {
		List<Apple> greenApples = new ArrayList<>();
		for (Apple apple : basket) {
			if (apple.getColor() == color) {
				greenApples.add(apple);
			}
		}
		return greenApples;
	}

	/**
	 * 메서드(동작)를 추상화해서 활용하기
	 *
	 * @param basket
	 * @param foo
	 * @return List<Apple> type
	 * @method filterApples
	 * @author hoho
	 * @date 2024 04 24 15:21
	 */
	public static List<Apple> filterApples(List<Apple> basket, ApplePredicate foo) {
		List<Apple> greenApples = new ArrayList<>();
		for (Apple apple : basket) {
			if (foo.test(apple)) {
				greenApples.add(apple);
			}
		}
		return greenApples;
	}

	/**
	 * 제너릭 활용하기
	 * @method   filter
	 * @param    basket
	 * @param    foo
	 * @return   List<T> type
	 * @param    <T>
	 * @author   hoho
	 * @date     2024 04 24 15:39

	 */

	public static <T> List<T> filter(List<T> basket, GenericPredicate<T> foo) {
		List<T> tmp = new ArrayList<>();
		for (T fruit : basket) {
			if (foo.test(fruit)) {
				tmp.add(fruit);
			}
		}
		return tmp;
	}
}