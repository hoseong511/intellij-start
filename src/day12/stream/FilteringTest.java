package day12.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : day12.stream
 * fileName       : Filtering
 * author         : hoho
 * date           : 4/24/24
 * description    :
 */

class Dish {
	private final String name; // 요리 이름
	private final boolean vegeterian; // 채식주의 여부
	private final int calories; // 칼로리
	private final Type type; // 요리 카테고리

	public enum Type {
		MEAT, FISH, OTHER
	}

	public Dish(String name, boolean vegeterian, int calories, Type type) {
		this.name = name;
		this.vegeterian = vegeterian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegeterian() {
		return vegeterian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Dish{" +
				"name='" + name + '\'' +
				", vegeterian=" + vegeterian +
				", calories=" + calories +
				", type=" + type +
				'}';
	}
}

public class FilteringTest {
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
	void 내장_필터링_활용() {
		List<Dish> dishList = menuList
				.stream()
				.filter(dish -> dish.isVegeterian())
				.collect(Collectors.toList());
		dishList.forEach(dish -> {
			System.out.println(dish.getName());
		});
	}

	@Test
	void 내장_필터링_활용2() {
		List<Dish> dishList = menuList
				.stream()
				.filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
				.collect(Collectors.toList());
		System.out.println("dishList = " + dishList);
	}

	@Test
	void 내장_필터링_활용3() {
		List<Integer> numbers = List.of(1, 1, 1, 1, 2, 4, 6, 8, 10, 10);
		List<Integer> integerList = numbers
				.stream()
				.filter(n -> n %2 == 0)
				.distinct()
				.collect(Collectors.toList());
		integerList.forEach(n -> System.out.println(n));
	}
}
