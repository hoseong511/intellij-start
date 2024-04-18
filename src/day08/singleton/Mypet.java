package day08.singleton;

/**
 * packageName    : day08.singleton
 * fileName       : Mypet
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 * singletone pattern : 클래스에서 인스턴스 하나만 생성하도록 제한하는 방식
 * 1. 생성자 private 처리
 * 2. 스스로 인스턴스 생성
 * 3. 공개된 메서드(static)를 통해 생성해둔 인스턴스 제공
 */
public class Mypet {
    String name;
    private static Mypet obj = new Mypet();

    private Mypet() {

    }

    /**
     * static으로 method 제공
     *
     * @return Mypet type
     * @method getInstance
     * @author hoho
     * @date 2024 04 18 11:56
     */
    static public Mypet getInstance() {
        return obj;
    }

    void introduce() {
        System.out.printf("내 반려동물의 이름은 %s\n", this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
