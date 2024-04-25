package day12.stream.comparator;

import day12.stream.Dish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : day12.stream.comparator
 * fileName       : MainTest
 * author         : hoho
 * date           : 4/25/24
 * description    :
 */
class MainTest {
	public static List<Student> studentList;
	public static List<Dish> menuList;

	@BeforeEach
	void before() {
		studentList = new ArrayList<>(List.of(
				new Student("홍철수", 15, 79),
				new Student("박영희", 17, 41),
				new Student("손흥민", 11, 11),
				new Student("감우성", 25, 34)
		));
		menuList = List.of(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 400, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH));
	}

	@Test
	void 정렬() {
		studentList.sort((o1, o2) -> o1.getAge() - o2.getAge());
		System.out.println("studentList = " + studentList);
	}

	@Test
	void 내림차_정렬() {
		studentList.sort(Comparator.comparing(Student::getScore).reversed());
		System.out.println("studentList = " + studentList);
	}

	@Test
	void 육류_요리중_칼로리_내림차순() {
		List<Dish> collect = menuList.stream()
				.filter(d -> d.getType() == Dish.Type.MEAT)
				.sorted(Comparator.comparing(Dish::getCalories).reversed())
				.collect(Collectors.toList());
		System.out.println("collect = " + collect);
	}

	@Test
	void 이름_내림차_정렬() {
		menuList.stream()
				.sorted(Comparator.comparing((Dish::getName)).reversed())
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}

	@Test
	void 칼로리300_오름차순_3개 () {
		menuList.stream()
				.filter(d->d.getCalories() > 300)
				.sorted(Comparator.comparing(Dish::getCalories))
				.limit(3)
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}

}