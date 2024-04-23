package day11.generic;

/**
 * packageName    : day11.generic
 * fileName       : Basket
 * author         : hoho
 * date           : 4/23/24
 * description    : 제네릭 클래스: 타입 복제가 가능한 클래스
 */
public class Basket<T> {
	private T fruit;

	public T getFruit() {
		return fruit;
	}

	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
