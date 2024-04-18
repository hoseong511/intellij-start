package day08.super_;

/**
 * packageName    : day08.super_
 * fileName       : Parent
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class Parent {
    int a;
    double b;

    public Parent() {
        this(33);
        this.a = 15;
        this.b = 0.1;
        System.out.println("parent constructor call");
    }

    public Parent(int a) {
        this.a = a;
        System.out.println("parent consturctor2 call");
    }

    /**
     * method is feature of obj // 행위, 행동,
     * @method   superMethod
     * @author   hoho
     * @date     2024 04 18 09:11

     */
    void superMethod() {
        System.out.println("parent a = " + this.a );
        System.out.println("parent b = " + this.b );
    }
}
