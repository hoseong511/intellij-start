package day08.enum_;

/**
 * packageName    : day08.enum_
 * fileName       : PizzaStatus
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 * <p>
 * enum 열거형 상수를 모아 놓은 클래스
 */
public enum PizzaStatus {
	ORDERED("주문 완료", 2), READY("준비 완료", 3), DELIVERED("배달 완료", 5);
	private String description;
	private int timeToSetup;

	PizzaStatus(String description, int timeToSetup) {
		this.description = description;
		this.timeToSetup = timeToSetup;
	}

	public String getDescription() {
		return description;
	}

	public int getTimeToSetup() {
		return timeToSetup;
	}
}
