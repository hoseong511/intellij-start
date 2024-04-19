package day09.poly.car;

/**
 * packageName    : day09.poly.car
 * fileName       : CarShop
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class CarShop {
	public Car exportCar(int money) {
		if (money == 6000) {
			return new Mustang();
		} else if (money == 4000) {
			return new Tucson();
		} else if (money == 3000) {
			return new Sonata();
		} else {
			return null;
		}
	}
}
