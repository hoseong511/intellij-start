package day09.ex00;

/**
 * packageName    : day09.ex00
 * fileName       : Computer
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
class Computer {
	private ComputerPart[] parts;

	public Computer() {
		this.parts = new ComputerPart[0];
	}

	public void addPart(ComputerPart part) {
		// ComputerPart[] 에 부품 추가
		ComputerPart[] tmp = new ComputerPart[this.parts.length + 1];
		for (int i = 0; i < this.parts.length; i++) {
			tmp[i] = this.parts[i];
		}
		tmp[tmp.length - 1] = part;
		this.parts = tmp;
	}

	public void showParts() {
		// 모든 부품 정보 출력
		for (ComputerPart part : parts) {
			part.describePart();
		}
	}
}

