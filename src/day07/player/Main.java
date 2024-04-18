package day07.player;

/**
 * packageName    : day07.player
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
        Warrior w = new Warrior("주차왕파킹");
        Mage m = new Mage("hoho");
        Hunter h = new Hunter("hawk");

        w.showStatus();
        m.showStatus();
        h.showStatus();
    }
}
