package day12.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * packageName    : day12.stream
 * fileName       : FindingTest
 * author         : hoho
 * date           : 4/25/24
 * description    :
 */
public class FindingTest {
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
	void 채식주의자_찾기() {
		boolean b = menuList.stream()
				.anyMatch(d -> d.isVegeterian());
		System.out.println("b = " + b);
	}

	@Test
	void 칼로리_100이하() {
		boolean b = menuList.stream()
				.anyMatch(d -> d.getCalories() <= 100);
		System.out.println("b = " + b);
	}

	@Test
	// allMatch는 모든 객체에 대해서 주어진 조건을 검사
	// noneMatch 모두 불일치한지 검사
	void 모든_요리가_1000이하() {
		boolean b = menuList.stream()
				.allMatch(d -> d.getCalories() < 1000);
		System.out.println("b = " + b);
	}
}
