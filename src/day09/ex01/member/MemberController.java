package day09.ex01.member;

/*
*   역할: 사용자의 메뉴 입력을 분기
* */
public class MemberController {
    static MemberView mv;

    static {
        mv = new MemberView();
    }
    public static void run() {
        while (true) {

            mv.continueProgram();
        }
    }
}
