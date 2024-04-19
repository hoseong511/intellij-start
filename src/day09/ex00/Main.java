package day09.ex00;

/**
 * packageName    : day09.ex00
 * fileName       : Main
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class Main {
	public static void main(String[] args) {
		Computer myComputer = new Computer();
		myComputer.addPart(new Processor("Intel i7", 320000));
		myComputer.addPart(new Memory("Corsair Vengeance 16GB", 90000));
		myComputer.addPart(new HardDrive("Samsung SSD 1TB", 150000));

		myComputer.showParts();
	}
}
