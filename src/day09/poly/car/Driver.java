package day09.poly.car;

/**
 * packageName    : day09.poly.car
 * fileName       : Driver
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class Driver {
	Car car;

	public Driver(Car car) {
		this.car = car;
	}

	public void setCar(Car car) {
		System.out.println("운전 " + (car instanceof Sonata));
		car.accelerate();
	}
}
