package day07.player;

/**
 * packageName    : day07.player
 * fileName       : Hunter
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 */
public class Hunter extends Player{

    int concentration;

    public Hunter(String nickname) {
        this.nickname = nickname;
        this.level = 10;
        this.hp = 10;
        this.concentration = 15;
    }
}
