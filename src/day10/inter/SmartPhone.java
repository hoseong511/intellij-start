package day10.inter;

/**
 * packageName    : day10.inter
 * fileName       : SmartPhone
 * author         : hoho
 * date           : 4/22/24
 * description    : 인터페이스는 기본적으로 추상화 상태 public abstract 붙이지 않아도 됨.
 *
 * 인터페이스는 처음부터 객체를 만들지 않을 것을 가정.
 * 생성자 및 필드를 선언할 수 없음.
 */
public interface SmartPhone {
	int age = 10; // public final static 이 생략되어있음. 상수 선언.!
	//스마트폰 스펙 보여주기 기능
	void info();
	//충전 기능
	void charge();
	//카메라 기능
	void camera();
}
