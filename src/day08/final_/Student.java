package day08.final_;

/**
 * packageName    : day08.final_
 * fileName       : Student
 * author         : hoho
 * date           : 4/18/24
 * description    : final 을 사용하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 *
 * static final 을 붙이면 global const like #DEFINE
 */
public class Student {
	String name;
	private final String ssn;
	static final String nation = "대한민국";
	public Student(final String ssn) {
//		ssn = "asdajsd"; // 매개변수에도 final 제한자 설정이 가능하다
		this.ssn = ssn;
		double pi = Math.PI;
	}
}
