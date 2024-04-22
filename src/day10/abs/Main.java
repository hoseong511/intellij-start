package day10.abs;

/**
 * packageName    : day10.abs
 * fileName       : Main
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog dog2 = new Dog();
		Cat cat = new Cat();
		Cat cat2 = new Cat();

//		Pet pet1 = new Pet();

		Pet[] petList = {dog, cat, dog2, cat2};

		for (Pet pet : petList) {
			pet.eat();
		}

		for (Pet pet : petList) {
			pet.sleep();
		}
	}
}
