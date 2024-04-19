package day09.ex00;

/**
 * packageName    : day09.ex00
 * fileName       : ComputerPart
 * author         : hoho
 * date           : 4/19/24
 * description    :
 *
 * 1. **기본 클래스 `ComputerPart` 정의**
 *     - 속성:
 *         - `partName` (부품 이름, 문자열)
 *         - `partPrice` (부품 가격, 정수형)
 *     - 메소드:
 *         - `describePart()`: 부품의 이름과 가격을 출력합니다.
 */
public class ComputerPart {
	protected String partName;
	protected double partPrice;

	public ComputerPart(String partName, double partPrice) {
		this.partName = partName;
		this.partPrice = partPrice;
	}

	public void describePart() {
		System.out.println("Part: " + partName + ", Price: " + partPrice);
	}

	@Override
	public String toString() {
		return "ComputerPart{" +
				"partName='" + partName + '\'' +
				", partPrice=" + partPrice +
				'}';
	}
}
