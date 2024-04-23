package day11.collection.list;

import day07.modi.pac1.A;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * packageName    : day11.collection.list
 * fileName       : ListExample
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */
public class ListTest {
	@Test
	@DisplayName("배열 리스트")
	void 배열리스트_테스트() {
		ArrayList<String> foods = new ArrayList<>();
		foods.add("hihi");
		foods.add("hihi");
		foods.add("hihi");
		foods.add("hihi");
		foods.add("hihi");
		System.out.println(foods);
	}

	@Test
	@DisplayName("리스트 메소드 이용")
	void 리스트_메소드() {
		List<String> foods = new ArrayList<>();

		foods.add("밥");
		foods.add("탕볶밥");
		foods.add(1,"밥");
		foods.add("밥");
		
		System.out.println(foods);
		
		foods.add(1, "피자");
		System.out.println("foods = " + foods);

		System.out.println("foods.size() = " + foods.size());

		System.out.println("foods.indexOf(\"피자\") = " + foods.indexOf("피자"));

		System.out.println("foods.contains(\"피자\") = " + foods.contains("피자"));
		
		foods.remove(0);
		foods.remove("밥");
		System.out.println("foods = " + foods);

		foods.set(0, "동파육");
		System.out.println("foods = " + foods);

		System.out.println("foods.get(1) = " + foods.get(1));

		for (String food : foods) {
			System.out.println("food = " + food);
		}
		
		foods.clear();

		System.out.println("foods.isEmpty() = " + foods.isEmpty());
	}

	@Test
	@DisplayName("리스트 초기화")
	void 리스트_초기화() {
		int[] arr = {10, 20, 30};
		List<Integer> numbers = new ArrayList<>(List.of(40, 24, 10,20,30));
		numbers.sort(Integer::compareTo);
		System.out.println("numbers = " + numbers);
		numbers.sort(Comparator.reverseOrder());
		System.out.println("numbers = " + numbers);
		
	}
}
