package day10.abs;

/**
 * packageName    : day10.abs
 * fileName       : Pet
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
public abstract class Pet {
	String name;
	int age;
	String kind;

	public Pet() {
	}

	public abstract void eat();
	public abstract void sleep();

	public final void nap() {
		System.out.println("nap nap nap");
	}
}
