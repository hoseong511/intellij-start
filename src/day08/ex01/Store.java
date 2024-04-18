package day08.ex01;

/**
 * packageName    : day08.ex01
 * fileName       : Store
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 *
 * 2. **클래스 `Store` 생성**
 *	- 속성:
 *	- `totalSales` (총 판매액, 정수형, static 변수)
 *     - 메소드:
 *         - `addSale(double amount)`: 판매액을 총 판매액에 추가하는 static 메소드.
 *         - `getTotalSales()`: 현재까지의 총 판매액을 반환하는 static 메소드.
 */
public class Store {
	private static int totalSales = 0;
	static void addSale(int amount) {
		totalSales += amount;
	}
	public static int getTotalSales() {
		return totalSales;
	}
}
