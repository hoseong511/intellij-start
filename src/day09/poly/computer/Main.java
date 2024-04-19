package day09.poly.computer;

/**
 * packageName    : day09.poly.computer
 * fileName       : Main
 * author         : hoho
 * date           : 4/19/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/19/24        hoho       최초 생성
 */
public class Main {
	public static void main(String[] args) {
		Desktop myCom = new Desktop(new LgMonitor());
		myCom.changeMonitor(new LgMonitor());
		myCom.changeMonitor(new HpMonitor());
	}
}
