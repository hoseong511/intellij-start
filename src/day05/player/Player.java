package day05.player;

public class Player {
    String nickName;
    int level;
    int hp;

    /*
    * this() 생성자 호출 시, 첫 줄에 사용해야하고 1번 만 호출가능
    * */
    public Player() {
        this("no1", 5, 100);
        System.out.println("1번 생성자 호출");
    }

    Player(String name) {
        System.out.println("2번 생성자 호출");
        this.nickName = name;
        level = 1;
        hp = 50;
    }

    public Player(String nickName, int level) {
        System.out.println("3번 생성자 호출");
        this.nickName = nickName;
        this.level = level;
    }

    public Player(String nickName, int level, int hp) {
        System.out.println("4번 생성자 호출");
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }

    public void info() {
        System.out.printf("닉네임 : %s, 레벨: %d, 체력: %d", this.nickName, this.level, this.hp);
    }


    void attack(Player target) {
        target.hp -= 10;
        this.hp -= 3;
        System.out.printf("%s님이 %s님을 공격했습니다.\n", this.nickName, target.nickName);
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
