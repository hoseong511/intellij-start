package day09.poly.computer;

/**
 * packageName    : day09.poly.computer
 * fileName       : Desktop
 * author         : hoho
 * date           : 4/19/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/19/24        hoho       최초 생성
 */
public class Desktop {
	Monitor monitor;

	public Desktop(Monitor monitor) {
		this.monitor = monitor;
	}

	/**
	 * 모니터를 교체하는 메서드
	 *
	 * @param monitor
	 * @method changeMonitor
	 * @author hoho
	 * @date 2024 04 19 09:23
	 */
	public void changeMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
}
