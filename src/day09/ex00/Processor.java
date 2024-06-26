package day09.ex00;

/**
 * packageName    : day09.ex00
 * fileName       : Processor
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class Processor extends ComputerPart {
	public Processor(String partName, double partPrice) {
		super(partName, partPrice);
	}

	@Override
	public void describePart() {
		System.out.println("Processor: " + partName + ", Price: " + partPrice);
	}
}
