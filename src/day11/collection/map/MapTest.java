package day11.collection.map;

import day09.poly.car.Tucson;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : day11.collection.map
 * fileName       : MapExample
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */
public class MapTest {
	@Test
	@DisplayName("map test key-value 쌍을 쉽게 만들기")
	void 맵() {
		Map<String, Object> map = new HashMap<>();
		
		map.put("지갑잔액", 500);
		map.put("자동차", new Tucson());
		System.out.println("map = " + map);
		System.out.println("map.size() = " + map.size());

		int money = (int) map.get("지갑잔액");
		System.out.println("money = " + money);

		map.put("지갑잔액", 999);
		System.out.println("map = " + map);

		for (String s : map.keySet()) {
			System.out.println("s = " + s);
			System.out.println("map.get(s) = " + map.get(s));
			
		}
	}
}
