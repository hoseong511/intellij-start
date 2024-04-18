package day08.static_;

/**
 * packageName    : day08.static_
 * fileName       : Calculator
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class Calculator {
    String color;
    static double pi;

    double calcArea(int r) {
        return pi * r * r;
    }

    /**
     *
     * @method   paint
     * @param    color
     * @author   hoho
     * @date     2024 04 18 11:19

     */
    void paint(String color) {
        this.color = color;
    }
}
