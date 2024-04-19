package day09.poly.car;

/**
 * packageName    : day09.poly.car
 * fileName       : Main
 * author         : hoho
 * date           : 4/19/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/19/24        hoho       최초 생성
 *
 * 다형성으로 이종모음 배열 활용
 * 다형성을 활용한 역할 위주의 프로그래밍
 */
public class Main {
	public static void main(String[] args) {
		Car sonata1 = new Sonata();
		Car sonata2 = new Sonata();
		Car sonata3 = new Sonata();
		Car tucson1 = new Tucson();
		Car tucson2 = new Tucson();
		Car mustang1 = new Mustang();
		Car mustang2 = new Mustang();
		Car mustang3= new Mustang();
		Car mustang4 = new Mustang();

		Car[] sArr = {sonata1, sonata2, sonata3, tucson1, tucson2, mustang1, mustang2, mustang3, mustang4};
		for (Car car : sArr) {
			car.accelerate();
		}

		Object[] oArr = {"abc", "def", 'c', 100, 100L, 10.11, false};
		for (Object o : oArr) {
			System.out.println(o);
		}

		Sonata mySonata = new Sonata();
		mySonata.accelerate();
		mySonata.joinSonataClub();

		CarShop shop = new CarShop();

		/*
		*  다운캐스팅 조건 : 상속 관계, '(자식)(부모)자식' 인 경우만 가능 // '(자식)부모' 는 불가능
		* 부모 타입으로 업캐스팅된 자식 객체인 경우에만 자식 타입으로 다운 캐스팅 가
		*
		* */
		Sonata car = (Sonata) shop.exportCar(3000);

		Car ttt = new Tucson();
		Tucson tts = (Tucson) ttt;

	}
}
