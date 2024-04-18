package day07.inherit.ex2;

/**
 * packageName    : day07.inherit.ex2
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
        Television tv = new Television("Samsung TV", 2000000, "Samsung", 55);
        Smartphone phone = new Smartphone("iPhone 13", 890000, "Apple", 256);

        System.out.println("TV Info:");
        tv.displayInfo();

        System.out.println("\nSmartphone Info:");
        phone.displayInfo();
    }
}
