package day10.abs;

/**
 * packageName    : day10.abs
 * fileName       : Cat
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
public class Cat extends Pet{
	String name;
	int age;
	String kind;

	public void eat() {
		System.out.println("냐옹 밥 먹기!");
	}

	public void sleep() {
		System.out.println("냐옹 잠 자기!");
	}

	public void takeNap() {
		System.out.println("name = " + name + " take Nap!");
	}

}
