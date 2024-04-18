package day08.static_;

/**
 * packageName    : day08.static_
 * fileName       : Count
 * author         : hoho
 * date           : 4/18/24
 * description    : 사용 제한자 (usage modifier) static
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class Count {
    static int x; // static field
    int y; // instance field

    /**
     * static method 내부에서 instance field 참조 x
     * static 은 instance 생성 없이 호출 가능한 제한자
     * @method   m1
     * @author   hoho
     * @date     2024 04 18 10:58

     */
    public static void m1() {
        System.out.println("called m1");
//        System.out.printf("x : %d, y : %d\n", x, y);
    }

    public void m2() {
        System.out.println("called m2");
    }
}
