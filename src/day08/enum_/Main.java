package day08.enum_;

/**
 * packageName    : day08.enum_
 * fileName       : Main
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class Main {
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.orderPizza();
		pizza.readyPizza();
		System.out.println(PizzaStatus.READY);
	}
}
