package day08.super_;

/**
 * packageName    : day08.super_
 * fileName       : Child
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class Child extends Parent {
    int a;
    double b;
    boolean c;

    public Child() {
        this(10);
        System.out.println("child constructor call!");
        this.c = true;
    }

    public Child(int a) {
        System.out.println("child constructor 2 call");
        this.a = a;
    }

    void childMethod() {
        System.out.println("child a = " + this.a);
        System.out.println("child b = " + this.b);
        System.out.println("child c = " + this.c);
        super.superMethod();
    }
}
