package day10.abs;

/**
 * packageName    : day10.abs
 * fileName       : Dog
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
public class Dog extends Pet {

	@Override
	public void eat() {
		System.out.println("멍멍 밥 먹기!");
	}

	@Override
	public void sleep() {
		System.out.println("멍멍 낮잠 자기!");
	}
}
