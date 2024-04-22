package day10.inter.animal;

/**
 * packageName    : day10.inter.animal
 * fileName       : Cat
 * author         : hoho
 * date           : 4/22/24
 * description    :
 *
 * - 필드(멤버 변수)를 사용학려면 상속하기.
 * - 부모 클래스의 생성자를 사용하고 싶지 않으면 abstract
 * - 기능 명세해놓고 사용하고 싶다면 interface
 */
public class Cat extends Animal implements Pet, Aggressive{
	@Override
	public void hunt(Pet pet) {

	}

	@Override
	public void handle() {

	}

	@Override
	public boolean inject() {
		return false;
	}

	@Override
	public void violent() {

	}
}
