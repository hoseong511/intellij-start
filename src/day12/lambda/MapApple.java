package day12.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : day12.lambda
 * fileName       : MapApple
 * author         : hoho
 * date           : 4/24/24
 * description    :
 */

public class MapApple {
	public static List<Color> mappingApplesByColor(List<Apple> basket) {
		List<Color> tmp = new ArrayList<>();
		for (Apple apple : basket) {
			tmp.add(apple.getColor());
		}
		return tmp;
	}
	public static List<Integer> mappingApplesByWeight(List<Apple> basket) {
		List<Integer> tmp = new ArrayList<>();
		for (Apple apple : basket) {
			tmp.add(apple.getWeight());
		}
		return tmp;
	}

	/**
	 * 제네릭 map 만들기
	 * @method   map
	 * @param    xList
	 * @param    f
	 * @return   List<Y> type
	 * @param    <X>
	 * @param    <Y>
	 * @author   hoho
	 * @date     2024 04 24 15:55

	 */
	public static <X, Y> List<Y> map(List<X> xList, GenericFunction<X, Y> f) {
		List<Y> tmp = new ArrayList<>();
		for (X x : xList) {
			Y y = f.apply(x);
			tmp.add(y);
		}
		return tmp;
	}
}
