package day07.encap;

/**
 * packageName    : day07.encap
 * fileName       : Main
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("소나타");
        myCar.startStop();
        myCar.setSpeed(1111);
        System.out.printf("speed %d\n", myCar.getSpeed());

        myCar.setMode('X');
        System.out.println("myCar.mode = " + myCar.getMode());
    }
}
