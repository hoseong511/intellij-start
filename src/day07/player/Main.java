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

        System.out.println("=======================");

        /**
         * 썬더볼트 여러 대상 공격
         * 1. 자신은 피해 x
         * 2. 타겟 대상 10 ~ 15 랜덤 피해
         */
        m.thunderbolt(w, h, m, new Warrior("eagle"));
    }
}
