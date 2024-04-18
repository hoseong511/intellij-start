package day07.inherit;

/**
 * packageName    : day07.inherit
 * fileName       : Computer
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 */
public class Computer extends Calculator {
    @Override
    public double calcAreaCircle(int r) {
        System.out.println("computer");
        return r * r * Math.PI;
    }
}
