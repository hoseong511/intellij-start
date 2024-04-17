package day06.member;

/*
*   역할: 사용자의 메뉴 입력을 분기
* */
public class MemberController {
    MemberView mv;

    MemberController() {
        this.mv = new MemberView();
    }
    void run() {
        while (true) {
            String menuNum = mv.showProgramMenu();
            switch (menuNum) {
                case "1":
                    mv.inputMember();
                    break;
                case "2":
                    mv.showMemberByEmail();
                    break;
                case "3":
                    mv.showMembers();
                    break;
                case "4":
                    mv.updatePassword();
                    break;
                case "5":
                    mv.deleteMemberByEmail();
                    break ;
                case "6":
                    mv.restoreMember();
                    break ;
                case "7":
                    boolean flag = mv.exitProgram();
                    if (flag) return;
                    break ;
                default:
                    mv.wrongMenuNumber();
                    break;
            }
            mv.continueProgram();
        }
    }
}
