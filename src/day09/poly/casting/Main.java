package day09.poly.casting;

/**
 * packageName    : day09.poly.casting
 * fileName       : Main
 * author         : hoho
 * date           : 4/19/24
 * description    : casting은 필요할 때에만 하기
 *
 * 선언 시, 타입 지정을 미리 상속 받은 타입으로 선언한다면 고유 메서드나 필드를 사용 x
 * 그래서 선언은 본인 타입, 필요할 때에만 상속 받은 타입으로 캐스팅
 */
public class Main {
	public static void main(String[] args) {
		Child child = new Child();
		child.c1 = 100;
		child.p1 = 200;

		child.method1();
		child.method2();

		Parent parent= new Parent();
		parent.p1 = 500;
		parent.method1();

		Child castingChild = new Child();

		castingChild.p1 = 100;
		castingChild.c1 = 300;
		castingChild.method1();
		castingChild.method2();

		Parent[] pArr = {castingChild};

	}
}
