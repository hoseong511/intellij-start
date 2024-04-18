package day07.player;

/**
 * packageName    : day07.player
 * fileName       : Player
 * author         : hoho
 * date           : 4/17/24
 * description    : 공통 속성(field)과 메서드를 갖는 super class
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 */
public class Player extends Object{
    String nickname;
    int level;
    int hp;

    /**
     * 현재 캐릭터 정보 출력
     *
     * @method showStatus
     * @author hoho
     * @date 2024 04 17 15:20
     */
    public void showStatus() {
        System.out.println("\n======= Character's Info =========");
        System.out.println("# name: " + this.nickname);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }

}
