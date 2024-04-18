package day08.singleton;

/**
 * packageName    : day08.singleton
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
        Mypet m1 = Mypet.getInstance();
        Mypet m2 = Mypet.getInstance();
        Mypet m3 = Mypet.getInstance();

        m1.setName("hoho2");
        System.out.println("m1 = " + m1.getName());
        System.out.println("m2 = " + m2.getName());
        System.out.println("m3 = " + m3.getName());

    }
}
