package day07.player;

/**
 * packageName    : day07.player
 * fileName       : Mage
 * author         : hoho
 * date           : 4/17/24
 * description    : 상속연습하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 */
public class Mage extends Player {

    int mana;

    public Mage(String nickname) {
        this.nickname = nickname;
    }


    public void thunderbolt(Player... targets) {
        for (Player target : targets) {
            if (target == this) continue;
            int damage = (int)((Math.random() * 5) + 11);
            System.out.println("target " + target.nickname + "을 공격");
            this.attack(target, damage);
        }
    }
}
