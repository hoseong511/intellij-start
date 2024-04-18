package day08.enum_;

/**
 * packageName    : day08.enum_
 * fileName       : Pizza
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class Pizza {
	private String pizzaName;
	private PizzaStatus status;

	public void orderPizza() {
		this.status = PizzaStatus.ORDERED;
		System.out.println("피자 주문이 들어왔습니다.");
	}

	public void readyPizza() {
		if (this.status == PizzaStatus.ORDERED) {
			this.status = PizzaStatus.READY;
			System.out.println("피자가 준비되었습니다.");
		} else {
			System.out.println("피자가 주문이 없습니다.");
		}
	}

	public void deliverPizza() {
		if (this.status == PizzaStatus.READY) {
			this.status = PizzaStatus.DELIVERED;
			System.out.println("피자가 배달되었습니다.");
		} else {
			System.out.println("피자 배달을 실패했습니다.");
		}
	}
}
