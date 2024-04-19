package day09.ex00;

/**
 * packageName    : day09.ex00
 * fileName       : Memory
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class Memory extends ComputerPart {
	public Memory(String partName, double partPrice) {
		super(partName, partPrice);
	}

	@Override
	public void describePart() {
		System.out.println("Memory: " + partName + ", Price: " + partPrice);
	}
}
