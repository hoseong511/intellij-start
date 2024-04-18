package day07.player;

/**
 * packageName    : day07.player
 * fileName       : Warrior
 * author         : hoho
 * date           : 4/17/24
 * description    : 상위 클래스로 부터 상속받은 하위 클래스
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 */
public class Warrior extends Player {

    int rage;

    public Warrior(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.rage = 100;
    }

    public void dash() {
        System.out.println();
    }

    /**
     * 오버라이딩: 메서드 이름, 접근제어자, 반환타입은 동일. 내부로직만 재정의
     *
     */
    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage: " + this.rage);
    }
}
