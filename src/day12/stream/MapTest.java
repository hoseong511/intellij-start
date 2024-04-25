package day12.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : day12.stream
 * fileName       : MapTest
 * author         : hoho
 * date           : 4/24/24
 * description    :
 */
public class MapTest {
	public static List<Dish> menuList;

	@BeforeEach
	void before() {
		menuList = List.of(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 400, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH)
		);
	}
	@Test
	void 맵() {
		List<String> strList = List.of("hoho", "ho", "string", "char", "integer");
		List<String> collect = strList.stream()
				.map((w) -> w + "hi")
				.collect(Collectors.toList());
		collect.forEach(len -> System.out.println(len));
	}

	@Test
	void 필드추출해보기() {
		List<SimpleDish> collect = menuList.stream()
				.map(dish -> new SimpleDish(dish.getName(), dish.getCalories()))
				.collect(Collectors.toList());
		collect.forEach(simpleDish -> System.out.println(simpleDish));
	}
	@Test
	void 필드추출해보기2() {
		List<SimpleDish> collect = menuList.stream()
				.map(dish -> new SimpleDish(dish))
				.collect(Collectors.toList());
		collect.forEach(simpleDish -> System.out.println(simpleDish));
	}
	@Test
	void 필드추출해보기3() {
		List<SimpleDish> collect = menuList.stream()
				.map(SimpleDish::new)
				.collect(Collectors.toList());
		collect.forEach(simpleDish -> System.out.println(simpleDish));
	}
	@Test
	void 맵이랑필터같이써보기() {
		List<DishDetail> collect = menuList.stream()
				.filter(d -> d.getCalories() >= 500)
				.map(DishDetail::new)
				.collect(Collectors.toList());

		System.out.println("collect = " + collect);
	}

	@Test
	void mapToInt사용() {
		int sum = menuList.stream()
				.mapToInt(Dish::getCalories)
				.sum();
		System.out.println("sum = " + sum);
	}

	@Test
	void 육류_메뉴의_평균_칼로리() {
		double asDouble = menuList.stream()
				.filter(d -> d.getType() == Dish.Type.MEAT)
				.mapToInt(d -> d.getCalories())
				.average()
				.getAsDouble();
		System.out.println("asDouble = " + asDouble);
	}
}
