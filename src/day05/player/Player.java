package day05.player;

public class Player {
    String nickName;
    int level;
    int hp;

    Player(String name) {
        this.nickName = name;
        level = 1;
        hp = 50;
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
