package day09.ex00;

/**
 * packageName    : day09.ex00
 * fileName       : HardDrive
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
class HardDrive extends ComputerPart {
	public HardDrive(String partName, double partPrice) {
		super(partName, partPrice);
	}

	@Override
	public void describePart() {
		System.out.println("Hard Drive: " + partName + ", Price: " + partPrice);
	}
}
