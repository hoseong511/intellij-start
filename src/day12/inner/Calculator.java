package day12.inner;

/**
 * packageName    : day12.inner
 * fileName       : Calculator
 * author         : hoho
 * date           : 4/24/24
 * description    :
 * @FunctionalInterface : 람다를 사용할 수 있는지 확인하는 어노테이션
 */
@FunctionalInterface
public interface Calculator {
	int operate(int n1, int n2);
}
