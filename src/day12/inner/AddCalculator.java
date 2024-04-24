package day12.inner;

/**
 * packageName    : day12.inner
 * fileName       : AddCalculator
 * author         : hoho
 * date           : 4/24/24
 * description    :
 */

public class AddCalculator implements Calculator{
	@Override
	public int operate(int n1, int n2) {
		return n1 + n2;
	}
}
