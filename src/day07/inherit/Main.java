package day07.inherit;

/**
 * packageName    : day07.inherit
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
        Calculator cal = new Calculator();
        Computer com = new Computer();

        System.out.println("계산기로 구한 원의 넓이: " + cal.calcAreaCircle(5));
        System.out.println("컴퓨터로 구한 원의 넓이: " + com.calcAreaCircle(5));
    }
}
