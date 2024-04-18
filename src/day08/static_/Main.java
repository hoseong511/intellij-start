package static_;

/**
 * packageName    : static_
 * fileName       : Main
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.y = 1;
        Count.x = 30;
        System.out.println("c1.y + Count.x = " + c1.y + " " + Count.x);

        c1.m2();
        c1.m1();
        Count.m1();
    }
}
