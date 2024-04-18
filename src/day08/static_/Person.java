package day08.static_;

/**
 * packageName    : day08.static_
 * fileName       : Person
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class Person {
    String name;
    int age;
    static String nation;

    /**
     * 정적 초기화자 static initializer
     * static field 의 생성자
     */
    static {
       nation = "대한민국";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.nation = "대한민국";
    }
}
